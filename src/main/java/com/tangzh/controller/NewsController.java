package com.tangzh.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.tangzh.domain.Admin;
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
	
	@RequestMapping("/adminNews.do")
	public String adminNews(Model model) {
		NewsExample example= new NewsExample();
		example.setOrderByClause("pub_time desc");
		PageHelper.startPage(1, 5);
		List<News> list= newService.selectByExample(example);
		model.addAttribute("newses", list);
		return "admin/newsList";
	}
	
	@RequestMapping("/showNews.do")
	public String showNews(Model model,int nid) {
		News news=newService.selectByPrimaryKey(nid);
		model.addAttribute("news", news);		
		return "admin/showNews";
	}
	
	@RequestMapping("/changeNews.do")
	public String changeNews(HttpServletRequest request,int nid) {
		try {
			News news=newService.selectByPrimaryKey(nid);
			Admin admin=(Admin) request.getSession().getAttribute("current_admin");
			news.setContent(request.getParameter("newsContent"));
			news.setTitle(request.getParameter("newsTitle"));
			Date date=new Date();
			Timestamp ts=new Timestamp(date.getTime());
			news.setPubTime(ts);
			news.setAid(admin.getAid());
			newService.updateByPrimaryKey(news);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/changeNews";
		}
		return "admin/success";
	}
	
	@RequestMapping("/deleteNews.do")
	public String deleteNews(int nid) {
		try {
			newService.deleteByPrimaryKey(nid);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "fail";
		}
		return "success";
	}
}
