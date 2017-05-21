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
	
	@RequestMapping("/showNotice.do")
	public String showNotice(Model model,int nid) {
		Notice notice=iTbNoticeService.selectByPrimaryKey(nid);
		model.addAttribute("notice", notice);
		return "admin/showNotice";
	}
	
	@RequestMapping("/noticeList.do")
	public String noticeList(Model model) {
		NoticeExample example=new NoticeExample();
		example.setOrderByClause("pub_time desc");
		PageHelper.startPage(1,5);
		List<Notice> notices=iTbNoticeService.selectByExample(example);
		model.addAttribute("notices", notices);
		return "admin/noticeList";
	}
	
	@RequestMapping("/deleteNotice.do")
	public String deleteNotice(HttpServletRequest request) {
		try {
			iTbNoticeService.deleteByPrimaryKey(Integer.parseInt(request.getParameter("nid")));
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/fail";
		}
		
		return "admin/success";
	}
	
	@RequestMapping("/changeNotice.do")
	public String changeNotice(HttpServletRequest request) {
		try {
			String s=request.getParameter("nid");
			System.out.println(s);
			Notice notice=iTbNoticeService.selectByPrimaryKey(Integer.parseInt(request.getParameter("nid")));
			Admin admin=(Admin) request.getSession().getAttribute("current_admin");
			notice.setContent(request.getParameter("noticeContent"));
			notice.setTitle(request.getParameter("noticeTitle"));
			notice.setAid(admin.getAid());
			Date date=new Date();
			Timestamp ts=new Timestamp(date.getTime());
			notice.setPubTime(ts);
			iTbNoticeService.updateByPrimaryKeySelective(notice);
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/changeNotice";
		}
		return "admin/success";
	}
	
}
