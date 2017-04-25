package com.tangzh.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tangzh.domain.Student;
import com.tangzh.service.ITbStudentService;

/**
 * student test
 * @author tangzh
 *
 */
public class StudentTest {
	final String path="spring_mybatis.xml";
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(path);
	
	@Test
	public void testSelectStudent(){
//		final String path="spring_mybatis.xml";
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(path);
		ITbStudentService studentService=(ITbStudentService) context.getBean("tbStudentService");
		Student student=studentService.selectByPrimaryKey(1);
		System.out.println(student);
	}
}
