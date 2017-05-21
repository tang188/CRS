package com.tangzh.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.domain.Admin;
import com.tangzh.service.ITbAdminService;
import com.tangzh.utils.Md5Utils;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Resource(name="adminService")
	ITbAdminService adminService;
	
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
	
	
}
