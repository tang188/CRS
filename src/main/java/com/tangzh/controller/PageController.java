package com.tangzh.controller;

import java.awt.image.BufferedImage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.utils.VerifiedCodeUtils;

@Controller
@RequestMapping("/page")
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
	
	@RequestMapping("/changeInfo.do")
	public String changeInfo() {
		return "student/changeInfo";
	}
	
	@RequestMapping("/changePassword.do")
	public String changePassword() {
		return "student/changePassword";
	}
	
	@RequestMapping("/sendRepair.do")
	public String sendRepair() {
		return "student/sendRepair";
	}
	
	@RequestMapping("/changeRepair.do")
	public String repairHistory(HttpServletRequest request) {		
		return "student/changeRepair";
	}
	
	@RequestMapping("/changeAdminInfo.do")
	public String changeAdminInfo() {
		return "admin/changeAdminInfo";
	}
	
	@RequestMapping("/changeAdminPassword.do")
	public String changeAdminPassword() {
		return "admin/changeAdminPassword";
	}
	
	@RequestMapping("/publish.do")
	public String publish() {
		return "admin/publish";
	}
	
	@RequestMapping("/changeNotice.do")
	public String changeNotice() {
		return "admin/changeNotice";
	}
	
	@RequestMapping("/changeNews.do")
	public String changeNews() {
		return "admin/changeNews";
	}
	
	@RequestMapping("/verifiedCode.do")
	public void verifiedCode(HttpServletRequest request,HttpServletResponse response) throws Exception{
		//1. 创建验证码类
		VerifiedCodeUtils utils = new VerifiedCodeUtils();
		//2. 得到验证码图片
		BufferedImage image = utils.getImage();
		//3. 把图片上的文本保存到session中
		request.getSession().setAttribute("session_verifiedCode", utils.getText());
		//4. 把图片响应给客户端
		VerifiedCodeUtils.output(image, response.getOutputStream());
	}
}
