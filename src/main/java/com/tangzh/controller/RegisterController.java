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
import com.tangzh.utils.ValidateUtils;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Resource
	ITbStudentService studentService;
	@Resource
	ITbAdminService adminService;
	
	@SuppressWarnings("null")
	@RequestMapping("/info")
	public String doRegister(HttpServletRequest request, Model model) {
		int account=Integer.parseInt(request.getParameter("account"));
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String tel=request.getParameter("tel");
		int register_status=Integer.parseInt(request.getParameter("register_status"));
		String error = "";
		
		//验证码校验。
		String session_verifiedCode = (String) request.getSession().getAttribute("session_verifiedCode");
		String user_verifiedCode = request.getParameter("verifiedCode");
		if(!ValidateUtils.isSame(session_verifiedCode, user_verifiedCode)){
			error = "验证码不正确！";
		}
		
		try {
			if (register_status==1) {
				Student student=null;
				student.setTel(tel);
				student.setSid(account);
				student.setName(name);
				student.setPassword(password);
				studentService.insertSelective(student);		
				error="Register Success";
			}
			else {
				Admin admin=null;
				admin.setAid(account);
				admin.setName(name);
				admin.setPassword(password);
				admin.setTel(tel);
				adminService.insertSelective(admin);
				error="Register Success";
			}
		} catch (Exception e) {
			error = "注册失败，请重试！";
			model.addAttribute("message", error);
			return "errorPage";
		}
		
		return "redirect:/pages/login.do";
	}
}
