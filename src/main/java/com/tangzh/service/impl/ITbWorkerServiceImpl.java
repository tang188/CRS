package com.tangzh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tangzh.domain.Worker;
import com.tangzh.domain.WorkerExample;
import com.tangzh.mapper.WorkerMapper;
import com.tangzh.service.ITbWorkerService;

@Service("workerService")
public class ITbWorkerServiceImpl implements ITbWorkerService{
	@Resource
	WorkerMapper workerMapper;
	@Override
	public int countByExample(WorkerExample example) {
		
		return workerMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WorkerExample example) {
		
		return workerMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer wid) {
		
		return workerMapper.deleteByPrimaryKey(wid);
	}

	@Override
	public int insert(Worker record) {
		
		return workerMapper.insert(record);
	}

	@Override
	public int insertSelective(Worker record) {
		
		return workerMapper.insertSelective(record);
	}

	@Override
	public List<Worker> selectByExample(WorkerExample example) {
		
		return workerMapper.selectByExample(example);
	}

	@Override
	public Worker selectByPrimaryKey(Integer wid) {
		
		return workerMapper.selectByPrimaryKey(wid);
	}

	@Override
	public int updateByExampleSelective(Worker record, WorkerExample example) {
		
		return workerMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Worker record, WorkerExample example) {
		
		return workerMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Worker record) {
		
		return workerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Worker record) {
		
		return workerMapper.updateByPrimaryKey(record);
	}

}
