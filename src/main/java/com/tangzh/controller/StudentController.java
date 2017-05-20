package com.tangzh.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.converter.DateConverter;
import com.tangzh.domain.Bill;
import com.tangzh.domain.Student;
import com.tangzh.service.ITbBillService;
import com.tangzh.service.ITbStudentService;
import com.tangzh.utils.Md5Utils;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Resource(name="tbStudentService")
	ITbStudentService iTbStudentService;
	
	@Resource(name="billService")
	ITbBillService billService;
	
	@RequestMapping("/showInfo.do")
	public String showInfo() {		
		return "student/studentInfo";
	}
	
	@RequestMapping("/changeInfo.do")
	public String changeInfo(HttpServletRequest request ,Model model) {
		String error="";
		try {
			Student student=(Student) request.getSession().getAttribute("current_student");
			student.setAddr(request.getParameter("studentAddr"));
			student.setAge(Integer.parseInt(request.getParameter("studentAge")));
			student.setClassNo(request.getParameter("studentClass"));
			student.setDept(request.getParameter("studentDept"));
			student.setName(request.getParameter("studentName"));
			student.setSpecialty(request.getParameter("studentSpecialty"));
			student.setTel(request.getParameter("studentTel"));
			if (Integer.parseInt(request.getParameter("studentSex"))==1) {
				student.setSex("男");
			}else {
				student.setSex("女");
			}
			iTbStudentService.updateByprimaryKey(student);
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			error="修改失败";
			model.addAttribute("error", error);
		}
		error="修改成功";
		model.addAttribute("error", error);
		return "student/studentInfo";
	}
	
	@RequestMapping("/changePassword.do")
	public String changePassword(Model model,HttpServletRequest request) {
		Student student=(Student) request.getSession().getAttribute("current_student");
		String error ="";
		if (student.getPassword().equals(Md5Utils.encode(request.getParameter("oldPassword")))) {
			if (request.getParameter("newPassword").equals(request.getParameter("valiPassword"))) {
				student.setPassword(Md5Utils.encode(request.getParameter("newPassword")));
				iTbStudentService.updateByprimaryKey(student);
				return "success";
			}else {
				error="两次密码不一致";
				model.addAttribute("error", error);
				return "/student/changePassword";
			}			
		}else {
			error="原密码不正确";
			model.addAttribute("error", error);
			return "/student/changePassword";
		}		
		
	}
	@RequestMapping("/sendRepair.do")
	public String sendRepair(HttpServletRequest request,Model model) {
		Student student=(Student) request.getSession().getAttribute("current_student");
		Bill bill=new Bill();
		String error="";
		bill.setAddr(request.getParameter("repairAddr"));
		bill.setDetail(request.getParameter("repairContent"));
		try {
			bill.setAppTime(new DateConverter().convert(request.getParameter("repairTime")));
			bill.setSid(student.getSid());
			bill.setTime(new Date());
			billService.insert(bill);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			error="未知错误";
			model.addAttribute("error", error);
			return "student/sendRepair";
		}
		return "success";
	}
	
}
