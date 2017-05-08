package com.tangzh.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangzh.service.ITbStudentService;

@RestController
@RequestMapping("/student")
public class TbStudentController {
	
	@Resource(name="tbStudentService")
	ITbStudentService iTbStudentService;
	
	
}
