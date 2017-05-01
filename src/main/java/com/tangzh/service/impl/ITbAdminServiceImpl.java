package com.tangzh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tangzh.domain.Admin;
import com.tangzh.domain.AdminExample;
import com.tangzh.domain.AdminExample.Criteria;
import com.tangzh.mapper.AdminMapper;
import com.tangzh.service.ITbAdminService;
/**
 * 
 * @author tangzh
 *
 */
@Service
public class ITbAdminServiceImpl implements ITbAdminService{
	@Resource
	AdminMapper adminMapper;
	
	@Override
	public int countByExample(AdminExample example) {
		
		return adminMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(int ano) {
		
		return adminMapper.deleteByPrimaryKey(ano);
	}

	@Override
	public int deleteByExample(AdminExample adminExample) {
		
		return adminMapper.deleteByExample(adminExample);
	}

	@Override
	public int insert(Admin admin) {
		
		return adminMapper.insert(admin);
	}

	@Override
	public Admin selectByPrimaryKey(int ano) {
		
		return adminMapper.selectByPrimaryKey(ano);
	}

	@Override
	public List<Admin> selectByExample(AdminExample adminExample) {
		
		return adminMapper.selectByExample(adminExample);
	}

	@Override
	public int updateByPrimaryKey(Admin admin) {
		
		return adminMapper.updateByPrimaryKey(admin);
	}

	@Override
	public Admin login(int ano, String pwd) {
		AdminExample adminExample=new AdminExample();
		Criteria cr=adminExample.createCriteria();
		cr.andAidEqualTo(ano);
		List<Admin> admins= adminMapper.selectByExample(adminExample);
		if(!admins.isEmpty()){
			Admin admin=admins.get(0);
			if(admin.getPassword().equals(pwd)){
				return admin;
			}
		}
		return null;
	}
	
}
