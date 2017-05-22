package com.tangzh.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.domain.Admin;
import com.tangzh.domain.Student;
import com.tangzh.service.ITbAdminService;
import com.tangzh.service.ITbStudentService;
import com.tangzh.utils.Md5Utils;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Resource(name="adminService")
	ITbAdminService adminService;
	@Resource(name="tbStudentService")
	ITbStudentService studentService;
	
	@RequestMapping("/main.do")
	public String goMain() {
		return "admin/main";
	}
	
	@RequestMapping("/adminInfo.do")
	public String adminInfo() {		
		return "admin/adminInfo";
	}
	
	@RequestMapping("/changeAdminInfo.do")
	public String changeAdminInfo(HttpServletRequest request) {
		Admin admin=(Admin) request.getSession().getAttribute("current_admin");
		admin.setAddr(request.getParameter("adminAddr"));
		admin.setName(request.getParameter("adminName"));
		admin.setPost(request.getParameter("adminPost"));
		admin.setTel(request.getParameter("adminTel"));		
		try {
			adminService.updateByPrimaryKey(admin);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return "admin/success";
	}
	
	@RequestMapping("/changeAdminPassword.do")
	public String changeAdminPassword(HttpServletRequest request,Model model) {
		Admin admin=(Admin) request.getSession().getAttribute("current_admin");
		String error="";
		if (request.getParameter("newAdminPassword").equals(request.getParameter("valiAdminPassword"))) {
			if (Md5Utils.encode(request.getParameter("oldAdminPassword")).equals(admin.getPassword())) {
				admin.setPassword(Md5Utils.encode(request.getParameter("newAdminPassword")));
				try {
					adminService.updateByPrimaryKey(admin);
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
					error="修改失败！";
					model.addAttribute("error", error);
					return "admin/changeAdminPassword";
				}
			}else {
				error="原密码错误！";
				model.addAttribute("error", error);
				return "admin/changeAdminPassword";
			}
		}else {
			error="两次密码不一致！";
			model.addAttribute("error", error);
			return "admin/changeAdminPassword";
		}
		return "admin/success";
	}
	
	@RequestMapping("/addStudent.do")
	public String addStudent(Model model,int sid,String name,String password,String tel) {
		Student student=new Student();
		boolean flag=false;
		try {
			student.setSid(sid);
			student.setName(name);
			student.setPassword(Md5Utils.encode(password));
			student.setTel(tel);
			studentService.insertSelective(student);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "fail";
		}
		flag=true;
		model.addAttribute("flag", flag);
		return "admin/addStudent";
	}
	
	@RequestMapping("/changeStudent.do")
	public String changeStudent(HttpServletRequest request,int sid) {
		Student student=new Student();
		try {
			student.setSid(sid);
			student.setAddr(request.getParameter("addr"));
			student.setAge(Integer.parseInt(request.getParameter("age")));
			student.setClassNo(request.getParameter("classNo"));
			student.setDept(request.getParameter("dept"));
			student.setName(request.getParameter("name"));
			student.setPassword(Md5Utils.encode(request.getParameter("password")));
			if (request.getParameter("sex").equals("1")) {
				student.setSex("男");
			}else {
				student.setSex("女");
			}
			student.setSpecialty(request.getParameter("specialty"));
			student.setTel(request.getParameter("tel"));
			
			studentService.updateByprimaryKey(student);
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/changeStudent";
		}
		return "admin/success";
	}
	@RequestMapping("/deleteStudent.do")
	public String deleteStudent(int sid) {
		try {
			studentService.deleteByPrimaryKey(sid);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/fail";
		}
		return "admin/success";
	}
}
