package com.tangzh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tangzh.domain.Student;
import com.tangzh.domain.StudentExample;
import com.tangzh.mapper.StudentMapper;
import com.tangzh.service.ITbStudentService;

/**
 * 
 * @author tangzh
 *
 */
@Service("tbStudentService")
public class ITbStudentServiceImpl implements ITbStudentService{
	@Resource
	StudentMapper studentmapper;
	
	@Override
	public int insert(Student stu) {

		return studentmapper.insert(stu);
	}

	@Override
	public Student selectByPrimaryKey(int sno) {

		return studentmapper.selectByPrimaryKey(sno);
	}

	@Override
	public List<Student> selectByExample(StudentExample example) {
		
		return studentmapper.selectByExample(example);
	}

	@Override
	public int updateByprimaryKey(Student student) {
		
		return studentmapper.updateByPrimaryKey(student);
	}

	@Override
	public int deleteByPrimaryKey(int sno) {

		return studentmapper.deleteByPrimaryKey(sno);
	}

	@Override
	public int countByExample(StudentExample example) {

		return studentmapper.countByExample(example);
	}

	@Override
	public Student login(int sid, String pwd) {
		StudentExample example=new StudentExample();
		StudentExample.Criteria cr=example.createCriteria();
		cr.andSidEqualTo(sid);
		List<Student> list=studentmapper.selectByExample(example);
		if(!list.isEmpty()){
			Student student=list.get(0);
			if(student.getPassword().equals(pwd)){
				return student;
			}
		}
		return null;
	}

	@Override
	public int insertSelective(Student record) {		
		return studentmapper.insertSelective(record);
	}
	
}
