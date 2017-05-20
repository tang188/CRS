package com.tangzh.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.domain.Notice;
import com.tangzh.domain.NoticeExample;
import com.tangzh.service.ITbNoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	@Resource
	ITbNoticeService iTbNoticeService;
	
	@RequestMapping("/showDetail.do")
	public String showDetail(Model model,int nid) {
		Notice notice=iTbNoticeService.selectByPrimaryKey(nid);
		model.addAttribute("notice", notice);
		return "student/showNoticeDetail";
	}
	
	@RequestMapping("/main.do")
	public String showMain(HttpServletRequest request,Model model) {
		//查询分页，传进list中，加入model
		NoticeExample example=new NoticeExample();
		List<Notice> list=iTbNoticeService.selectMore(example, 1, 5);
		int count=iTbNoticeService.countByExample(example);
		model.addAttribute("count",	 count);
		model.addAttribute("list",list);
		return "student/main";
	}
	
	@RequestMapping("/findNoticesByPage.do")
	public String findNoticesByPage(int pageIndex,int pageSize,Model model) {
		NoticeExample example=new NoticeExample();
		//example.setOrderByClause(nid desc);
		model.addAllAttributes(iTbNoticeService.selectMore(example, pageIndex, pageSize));
		return "student/main";
	}
}
