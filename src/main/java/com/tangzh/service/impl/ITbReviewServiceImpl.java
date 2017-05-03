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
	ReviewMapper repviewMapper;
	
	@Override
	public int countByExample(ReviewExample example) {
		
		return repviewMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ReviewExample example) {
		
		return repviewMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		
		return repviewMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Review record) {
		
		return repviewMapper.insert(record);
	}

	@Override
	public int insertSelective(Review record) {
		
		return repviewMapper.insertSelective(record);
	}

	@Override
	public List<Review> selectByExample(ReviewExample example) {
		
		return repviewMapper.selectByExample(example);
	}

	@Override
	public Review selectByPrimaryKey(Integer id) {
		
		return repviewMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Review record, ReviewExample example) {
		
		return repviewMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Review record, ReviewExample example) {
		
		return repviewMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Review record) {
		
		return repviewMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Review record) {
		
		return repviewMapper.updateByPrimaryKey(record);
	}

}
