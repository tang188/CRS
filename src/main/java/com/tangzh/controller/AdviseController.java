package com.tangzh.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.domain.Advise;
import com.tangzh.domain.Student;
import com.tangzh.service.ITbAdviseService;

@Controller
@RequestMapping("/advise")
public class AdviseController {
	
	@Resource
	ITbAdviseService adviseService;

	@RequestMapping("/advise.do")
	public String advise() {
		return "advise";
	}
	@RequestMapping("/sendAdvise.do")
	public String sendAdvise(HttpServletRequest request) {
		
		Advise advise=new Advise();
		advise.setContent(request.getParameter("adviseContent"));
		advise.setTime(new Date());
		Object obj=request.getSession().getAttribute("current_student");
		Student student=(Student) obj;
		advise.setSid(student.getSid());
		adviseService.insert(advise);
		return "success";
	}
}
