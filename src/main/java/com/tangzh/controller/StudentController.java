package com.tangzh.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.converter.DateConverter;
import com.tangzh.domain.Bill;
import com.tangzh.domain.BillExample;
import com.tangzh.domain.BillExample.Criteria;
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
		boolean flag=false;
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
			flag=false;
			model.addAttribute("flag", flag);
			return "student/changeInfo";
		}		
		flag=true;		
		model.addAttribute("flag", flag);
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
		boolean flag=false;
		bill.setAddr(request.getParameter("repairAddr"));
		bill.setDetail(request.getParameter("repairContent"));
		try {
			String s= request.getParameter("repairTime");
			Date date=new DateConverter().convert(s);
			Timestamp timestamp=new Timestamp(date.getTime());
			bill.setAppTime(timestamp);
			bill.setSid(student.getSid());
			bill.setTime(timestamp);
			bill.setStatus("等待受理");			
			billService.insert(bill);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			error="正确输入时间2012-01-02 12:12:12";
			model.addAttribute("error", error);
			e.printStackTrace();
			return "student/sendRepair";
		}
		flag=true;
		model.addAttribute("flag", flag);
		return "success";
	}
	
	@RequestMapping("/repairHistory.do")
	public String repairHistory(HttpServletRequest request,Model model) {
		Student student=(Student) request.getSession().getAttribute("current_student");
		BillExample example=new BillExample();
		example.setOrderByClause("bid desc");
		Criteria criteria = example.createCriteria();
		List<Bill> historyList=null;
		try {
			criteria.andSidEqualTo(student.getSid());			
			historyList = billService.selectByExample(example);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		model.addAttribute("historyList", historyList);
		return "student/repairHistory";
	}
	
	@RequestMapping("/changeRepair.do")
	public String changeRepair(HttpServletRequest request,Model model) {
		Bill bill=billService.selectByPrimaryKey(Integer.parseInt(request.getParameter("bId")));
		String error="";
		bill.setAddr(request.getParameter("changeRepairAddr"));
		try {
			Date date=new DateConverter().convert(request.getParameter("changeRepairTime"));
			Timestamp ts=new Timestamp(date.getTime());
			bill.setAppTime(ts);
			bill.setDetail(request.getParameter("changeRepairContent"));
			billService.updateByPrimaryKeySelective(bill);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			error="正确输入时间,如2012-01-02 12:12:12";
			model.addAttribute("error", error);
			e.printStackTrace();
			return "student/changeRepair";
		}
		return "redirect:/student/repairHistory.do";
	}
}
