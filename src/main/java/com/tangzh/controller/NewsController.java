package com.tangzh.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.tangzh.domain.News;
import com.tangzh.domain.NewsExample;
import com.tangzh.service.ITbNewsService;

@Controller
@RequestMapping("/news")
public class NewsController {

	@Resource
	ITbNewsService newService;
	
	@RequestMapping("/newsList.do")
	public String newsList(Model model) {
		NewsExample example= new NewsExample();
		PageHelper.startPage(1, 5);
		List<News> list= newService.selectByExample(example);
		model.addAttribute("newsList", list);
		return "student/newsList";
	}
	
	@RequestMapping("/showDetail.do")
	public String showNewsDetail(int newsId,Model model) {
		News news=newService.selectByPrimaryKey(newsId);
		model.addAttribute("news", news);
		return "/student/showNewsDetail";
	}
}
