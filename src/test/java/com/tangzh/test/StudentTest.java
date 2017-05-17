package com.tangzh.test;

import java.io.Reader;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.tangzh.domain.Admin;
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

	ITbStudentService studentService=(ITbStudentService) context.getBean("tbStudentService");
	@Test
	public void testSelectStudent(){
//		final String path="spring_mybatis.xml";
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(path);
		
		Student student=studentService.selectByPrimaryKey(1);
		System.out.println(student.toString());
	}
	
	@Test
	public void testInsertStudent() {		

		try {
			Student student=new Student();
			student.setSid(22);
			student.setName("11");
			student.setPassword("11");
			student.setTel("11");
			studentService.insert(student);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
