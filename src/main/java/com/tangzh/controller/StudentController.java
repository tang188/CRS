package com.tangzh.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangzh.service.ITbStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Resource(name="tbStudentService")
	ITbStudentService iTbStudentService;
	
}
