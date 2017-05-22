package com.tangzh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tangzh.domain.Repair;
import com.tangzh.domain.RepairExample;
import com.tangzh.mapper.RepairMapper;
import com.tangzh.service.ITbRepairService;
@Service("repairService")
public class ITbRepairServiceImpl implements ITbRepairService{

	@Resource
	RepairMapper repairMapper;
	@Override
	public int countByExample(RepairExample example) {
		
		return repairMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(RepairExample example) {
		
		return repairMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer rId) {
		
		return repairMapper.deleteByPrimaryKey(rId);
	}

	@Override
	public int insert(Repair record) {
		
		return repairMapper.insert(record);
	}

	@Override
	public int insertSelective(Repair record) {
		
		return repairMapper.insertSelective(record);
	}

	@Override
	public List<Repair> selectByExample(RepairExample example) {
		
		return repairMapper.selectByExample(example);
	}

	@Override
	public Repair selectByPrimaryKey(Integer rId) {
		
		return repairMapper.selectByPrimaryKey(rId);
	}

	@Override
	public int updateByExampleSelective(Repair record, RepairExample example) {
		
		return repairMapper.updateByExample(record, example);
	}

	@Override
	public int updateByExample(Repair record, RepairExample example) {
		
		return repairMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Repair record) {
		
		return repairMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Repair record) {
		
		return repairMapper.updateByPrimaryKey(record);
	}

}
