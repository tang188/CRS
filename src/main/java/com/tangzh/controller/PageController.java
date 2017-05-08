package com.tangzh.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {
	
	@RequestMapping("/login.do")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/register.do")
	public String register(){
		return "register";		
	}
	
	@RequestMapping("/findPassword.do")
	public String findPassword() {
		return "findPassword";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpServletRequest request) {
		request.getSession().removeAttribute("current_student");
		request.getSession().removeAttribute("current_admin");
		return "redirect:/page/login.do";
	}
}
