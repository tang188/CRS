package com.tangzh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tangzh.domain.AdminLog;
import com.tangzh.domain.AdminLogExample;
import com.tangzh.mapper.AdminLogMapper;
import com.tangzh.service.ITbAdminLogService;

@Service("adminLogService")
public class ITbAdminLogServiceImpl implements ITbAdminLogService{
	@Resource
	AdminLogMapper adminLogMapper;

	@Override
	public int countByExample(AdminLogExample example) {
		// TODO Auto-generated method stub
		return adminLogMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(AdminLogExample example) {
		// TODO Auto-generated method stub
		return adminLogMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer lid) {
		// TODO Auto-generated method stub
		return adminLogMapper.deleteByPrimaryKey(lid);
	}

	@Override
	public int insert(AdminLog record) {
		// TODO Auto-generated method stub
		return adminLogMapper.insert(record);
	}

	@Override
	public int insertSelective(AdminLog record) {
		// TODO Auto-generated method stub
		return adminLogMapper.insertSelective(record);
	}

	@Override
	public List<AdminLog> selectByExample(AdminLogExample example) {
		// TODO Auto-generated method stub
		return adminLogMapper.selectByExample(example);
	}

	@Override
	public AdminLog selectByPrimaryKey(Integer lid) {
		// TODO Auto-generated method stub
		return adminLogMapper.selectByPrimaryKey(lid);
	}

	@Override
	public int updateByExampleSelective(AdminLog record, AdminLogExample example) {
		// TODO Auto-generated method stub
		return adminLogMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(AdminLog record, AdminLogExample example) {
		// TODO Auto-generated method stub
		return adminLogMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(AdminLog record) {
		// TODO Auto-generated method stub
		return adminLogMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(AdminLog record) {
		// TODO Auto-generated method stub
		return adminLogMapper.updateByPrimaryKey(record);
	}

}
