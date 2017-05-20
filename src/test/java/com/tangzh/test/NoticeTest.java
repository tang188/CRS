package com.tangzh.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageInfo;
import com.tangzh.domain.Notice;
import com.tangzh.domain.NoticeExample;
import com.tangzh.service.ITbNoticeService;

public class NoticeTest {
	final String path="spring_mybatis.xml";
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(path);
	@Resource
	ITbNoticeService noticeService=(ITbNoticeService) context.getBean("noticeService");
	
	@Test
	public void testPage() {
		NoticeExample example=new NoticeExample();
		List<Notice> list=noticeService.selectMore(example,3,2);
		for (Notice notice : list) {
			System.out.println(notice);
		}
		context.close();
	}
	
}
