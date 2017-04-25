package com.tangzh.service;

import java.util.List;

import com.tangzh.domain.Admin;
import com.tangzh.domain.AdminExample;

/**
 * 
 * @author tangzh
 *
 */
public interface ITbAdminService {
	/**
	 * 
	 * @param example
	 * @return
	 */
	int countByExample(AdminExample example);
	/**
	 * 
	 * @param ano
	 * @return
	 */
	int deleteByExample(int ano);
	/**
	 * 
	 * @param adminExample
	 * @return
	 */
	int deleteByExample(AdminExample adminExample);
	/**
	 * 
	 * @param admin
	 * @return
	 */
	int insert(Admin admin);
	/**
	 * 
	 * @param ano
	 * @return
	 */
	Admin selectByPrimaryKey(int ano);
	/**
	 * 
	 * @param adminExample
	 * @return
	 */
	List<Admin> selectByExample(AdminExample adminExample);
	/**
	 * 
	 * @param admin
	 * @return
	 */
	int updateByPrimaryKey(Admin admin);
	/**
	 * 
	 * @param ano
	 * @param pwd
	 * @return
	 */
	Admin login(int ano,String pwd);
}
