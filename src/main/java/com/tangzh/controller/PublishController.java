package com.tangzh.controller;

import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.domain.Admin;
import com.tangzh.domain.News;
import com.tangzh.domain.Notice;
import com.tangzh.service.ITbNewsService;
import com.tangzh.service.ITbNoticeService;

@Controller
@RequestMapping("/publish")
public class PublishController {
	
	@Resource(name="noticeService")
	ITbNoticeService noticeService;
	
	@Resource(name="newsService")
	ITbNewsService newsService;
	
	@RequestMapping("/publish.do")
	public String publish(HttpServletRequest request,Model model) {		
		int publishType=Integer.parseInt(request.getParameter("publishType"));
		Admin admin=(Admin) request.getSession().getAttribute("current_admin");
		Date date=new Date();
		Timestamp ts=new Timestamp(date.getTime());
		try {
			if(publishType==1) {
				News news=new News();
				news.setAid(admin.getAid());
				news.setContent(request.getParameter("content"));
				news.setPubTime(ts);
				news.setTitle(request.getParameter("title"));
				newsService.insertSelective(news);
			}else {
				Notice notice=new Notice();
				notice.setAid(admin.getAid());
				notice.setContent(request.getParameter("content"));
				notice.setPubTime(ts);
				notice.setTitle(request.getParameter("title"));
				noticeService.insertSelective(notice);
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/publish";
		}
		return "admin/success";		
	}
}
