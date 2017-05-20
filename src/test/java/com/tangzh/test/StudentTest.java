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
