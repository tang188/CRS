package com.tangzh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tangzh.domain.Review;
import com.tangzh.domain.ReviewExample;
import com.tangzh.mapper.ReviewMapper;
import com.tangzh.service.ITbReviewService;

@Service("reviewService")
public class ITbReviewServiceImpl implements ITbReviewService{

	@Resource
	ReviewMapper repairMapper;
	
	@Override
	public int countByExample(ReviewExample example) {
		
		return repairMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ReviewExample example) {
		
		return repairMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		
		return repairMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Review record) {
		
		return repairMapper.insert(record);
	}

	@Override
	public int insertSelective(Review record) {
		
		return repairMapper.insertSelective(record);
	}

	@Override
	public List<Review> selectByExample(ReviewExample example) {
		
		return repairMapper.selectByExample(example);
	}

	@Override
	public Review selectByPrimaryKey(Integer id) {
		
		return repairMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Review record, ReviewExample example) {
		
		return repairMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Review record, ReviewExample example) {
		
		return repairMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Review record) {
		
		return repairMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Review record) {
		
		return repairMapper.updateByPrimaryKey(record);
	}

}
