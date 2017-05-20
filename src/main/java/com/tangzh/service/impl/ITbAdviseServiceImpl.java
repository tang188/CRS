package com.tangzh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tangzh.domain.Advise;
import com.tangzh.domain.AdviseExample;
import com.tangzh.mapper.AdviseMapper;
import com.tangzh.service.ITbAdviseService;
@Service
public class ITbAdviseServiceImpl implements ITbAdviseService{

	@Resource
	AdviseMapper adviseMapper;
	
	@Override
	public int countByExample(AdviseExample example) {
		// TODO 自动生成的方法存根
		return adviseMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(AdviseExample example) {
		// TODO 自动生成的方法存根
		return adviseMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO 自动生成的方法存根
		return adviseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Advise record) {
		// TODO 自动生成的方法存根
		return adviseMapper.insert(record);
	}

	@Override
	public int insertSelective(Advise record) {
		// TODO 自动生成的方法存根
		return adviseMapper.insertSelective(record);
	}

	@Override
	public List<Advise> selectByExample(AdviseExample example) {
		// TODO 自动生成的方法存根
		return adviseMapper.selectByExample(example);
	}

	@Override
	public Advise selectByPrimaryKey(Integer id) {
		// TODO 自动生成的方法存根
		return adviseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Advise record, AdviseExample example) {
		// TODO 自动生成的方法存根
		return adviseMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Advise record, AdviseExample example) {
		// TODO 自动生成的方法存根
		return adviseMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Advise record) {
		// TODO 自动生成的方法存根
		return adviseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Advise record) {
		// TODO 自动生成的方法存根
		return adviseMapper.updateByPrimaryKey(record);
	}

}
