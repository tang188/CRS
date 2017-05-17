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
import com.tangzh.utils.ValidateUtils;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Resource
	ITbStudentService studentService;
	@Resource
	ITbAdminService adminService;
	
	@RequestMapping("/register.do")
	public String doRegister(HttpServletRequest request, Model model) {
		int account;
		String password;
		String password1;
		String name;
		String tel;
		String error = "";
		try {
			account = Integer.parseInt(request.getParameter("account"));
			password = request.getParameter("password");
			password1 = request.getParameter("password1");
			name = request.getParameter("name");
			tel = request.getParameter("tel");
		} catch (NumberFormatException e1) {			
			error="请正确输入信息";
			model.addAttribute("message", error);
			return "register";
		}
		int register_status=Integer.parseInt(request.getParameter("register_radios"));		
		
		//验证码校验。
		String session_verifiedCode = (String) request.getSession().getAttribute("session_verifiedCode");
		String user_verifiedCode = request.getParameter("verifiedCode");
		if(!ValidateUtils.isSame(session_verifiedCode, user_verifiedCode)){
			error = "验证码不正确！";
			model.addAttribute("message",error);
			return "register";
		}
		
		try {
			if (password.equals(password1)) {						
				if (register_status==1) {
					Student student=new Student();
					student.setTel(tel);
					student.setSid(account);
					student.setName(name);
					student.setPassword(Md5Utils.encode(password));
					studentService.insertSelective(student);		
					error="Register Success";
				}
				else {
					Admin admin=new Admin();
					admin.setAid(account);
					admin.setName(name);
					admin.setPassword(Md5Utils.encode(password));
					admin.setTel(tel);
					adminService.insertSelective(admin);
					error="Register Success";
				}			
			}else {
				error="密码不一致，重新输入";
				model.addAttribute("message", error);
				return "register";
			}
		} catch (Exception e) {
			error = "注册失败，请重试！";
			model.addAttribute("message", error);
			return "errorPage";
		}
		
		return "redirect:/page/login.do";
	}
}
