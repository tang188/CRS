package com.tangzh.test;

import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tangzh.domain.Bill;
import com.tangzh.domain.BillExample;
import com.tangzh.domain.Student;
import com.tangzh.domain.BillExample.Criteria;
import com.tangzh.service.ITbBillService;
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
	ITbBillService service=(ITbBillService)context.getBean("billService");
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
	
	@Resource(name="billService")
	ITbBillService billService;
	
	@Test
	public void testTimeConvert() throws ParseException {
		try {
		BillExample example=new BillExample();
		Criteria criteria = example.createCriteria();
		List<Bill> historyList=null;
			criteria.andSidEqualTo(123);
			criteria.andStatusEqualTo("等待受理");
			historyList = billService.selectByExample(example);
			for (Bill bill : historyList) {
				System.out.println(bill);
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}		
	}
	
}
