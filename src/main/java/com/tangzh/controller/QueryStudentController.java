package com.tangzh.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.domain.Student;
import com.tangzh.domain.StudentExample;
import com.tangzh.domain.StudentExample.Criteria;
import com.tangzh.service.ITbStudentService;

@Controller
@RequestMapping("/query")
public class QueryStudentController {
	@Resource(name="tbStudentService")
	ITbStudentService studentService;
	
	@RequestMapping("/searchStudentBySex.do")
	public String serachBySex(int condition,Model model) {
		try {
			StudentExample example=new StudentExample();
			Criteria criteria=example.createCriteria();
			String s;
			if (condition==1) {
				 s="男";
			}else {
				s="女";
			}
			criteria.andSexEqualTo(s);
			List<Student> list=studentService.selectByExample(example);
			model.addAttribute("studentList", list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/searchStudent";
		}
		return "admin/queryResult";
	}
	@RequestMapping("/searchStudentByDept.do")
	public String serachByDept(String condition,Model model) {
		try {
			StudentExample example=new StudentExample();
			Criteria criteria=example.createCriteria();
			criteria.andDeptLike("%"+condition+"%");
			List<Student> list=studentService.selectByExample(example);
			model.addAttribute("studentList", list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/searchStudent";
		}
		return "admin/queryResult";
	}
	@RequestMapping("/searchStudentByClass.do")
	public String serachByClass(String condition,Model model) {
		try {
			StudentExample example=new StudentExample();
			Criteria criteria=example.createCriteria();
			criteria.andClassNoLike("%"+condition+"%");
			List<Student> list=studentService.selectByExample(example);
			model.addAttribute("studentList", list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/searchStudent";
		}
		return "admin/queryResult";
	}
	@RequestMapping("/searchStudentBySpecialty.do")
	public String serachBySpecialty(String condition,Model model) {
		try {
			StudentExample example=new StudentExample();
			Criteria criteria=example.createCriteria();
			criteria.andSpecialtyLike("%"+condition+"%");
			List<Student> list=studentService.selectByExample(example);
			model.addAttribute("studentList", list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/searchStudent";
		}
		return "admin/queryResult";
	}
	
	@RequestMapping("/searchStudentByName.do")
	public String serachByName(String condition,Model model) {
		try {
			StudentExample example=new StudentExample();
			Criteria criteria=example.createCriteria();
			criteria.andNameLike("%"+condition+"%");
			List<Student> list=studentService.selectByExample(example);
			model.addAttribute("studentList", list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/searchStudent";
		}
		return "admin/queryResult";
	}
}
