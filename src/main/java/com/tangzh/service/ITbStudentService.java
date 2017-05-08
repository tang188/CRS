package com.tangzh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tangzh.domain.Student;
import com.tangzh.domain.StudentExample;

/**
 * studentService interface
 * @author tangzh
 *
 */
@Service
public interface ITbStudentService {
	/**
	 * insert student
	 * @param stu
	 * @return
	 */
	int insert(Student stu);
	
	int insertSelective(Student record);
	/**
	 * select by sno
	 * @param sno
	 * @return
	 */
	Student selectByPrimaryKey(int sno);
	/**
	 * select students by example
	 * @param example
	 * @return
	 */
	List<Student> selectByExample(StudentExample example);
	/**
	 * update student by student
	 * @param student
	 * @return
	 */
	int updateByprimaryKey(Student student);
	/**
	 * delete student by sno
	 * @param sno
	 * @return
	 */
	int deleteByPrimaryKey(int sno);
	/**
	 * count students by Example
	 * @param example
	 * @return
	 */
	int countByExample(StudentExample example);
	/**
	 * validate student
	 * @param sno
	 * @param pwd
	 * @return
	 */
	Student login(int sno,String pwd);
}
