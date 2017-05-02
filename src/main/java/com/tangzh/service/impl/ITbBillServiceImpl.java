package com.tangzh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tangzh.domain.Bill;
import com.tangzh.domain.BillExample;
import com.tangzh.mapper.BillMapper;
import com.tangzh.service.ITbBillService;

@Service("billService")
public class ITbBillServiceImpl implements ITbBillService{

	@Resource
	BillMapper billMapper;
	@Override
	public int countByExample(BillExample example) {
		// TODO Auto-generated method stub
		return billMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(BillExample example) {
		// TODO Auto-generated method stub
		return billMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer bid) {
		// TODO Auto-generated method stub
		return billMapper.deleteByPrimaryKey(bid);
	}

	@Override
	public int insert(Bill record) {
		// TODO Auto-generated method stub
		return billMapper.insert(record);
	}

	@Override
	public int insertSelective(Bill record) {
		// TODO Auto-generated method stub
		return billMapper.insertSelective(record);
	}

	@Override
	public List<Bill> selectByExample(BillExample example) {
		// TODO Auto-generated method stub
		return billMapper.selectByExample(example);
	}

	@Override
	public Bill selectByPrimaryKey(Integer bid) {
		// TODO Auto-generated method stub
		return billMapper.selectByPrimaryKey(bid);
	}

	@Override
	public int updateByExampleSelective(Bill record, BillExample example) {
		// TODO Auto-generated method stub
		return billMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Bill record, BillExample example) {
		// TODO Auto-generated method stub
		return billMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Bill record) {
		// TODO Auto-generated method stub
		return billMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Bill record) {
		// TODO Auto-generated method stub
		return billMapper.updateByPrimaryKey(record);
	}
}
