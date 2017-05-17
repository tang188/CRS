package com.tangzh.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.domain.Admin;
import com.tangzh.domain.Student;
import com.tangzh.service.ITbAdminService;
import com.tangzh.service.ITbStudentService;
import com.tangzh.utils.Md5Utils;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Resource
	ITbStudentService iTbStudentService;
	@Resource
	ITbAdminService iTbAdminService;
	
	@RequestMapping("/login.do")
	public String studentLogin(HttpServletRequest request, Model model) {
		HttpSession httpSession=request.getSession();
		int account = Integer.parseInt(request.getParameter("account"));
		String password = Md5Utils.encode(request.getParameter("password"));
		String error = "";
		int login_status = Integer.parseInt(request.getParameter("login_radios"));
		
		Student student=new Student();
		Admin admin =new Admin();
		//student login
		if (login_status==1) {
			student=iTbStudentService.login(account, password);
			if(student!=null) {
				httpSession.setAttribute("current_student", student);
				return "/student/main";
			}	
			error = "账号错误或者是密码错误";
		}
		//admin login 
		else {
			admin=iTbAdminService.login(account, password);
			if (admin!=null) {
				httpSession.setAttribute("current_admim", admin);
				return "/admin/main";
			}
			error = "账号错误或者是密码错误";
		}
		model.addAttribute("msg", error);
		return "login";
	}
		
}
