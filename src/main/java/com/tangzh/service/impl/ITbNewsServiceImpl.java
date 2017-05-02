package com.tangzh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tangzh.domain.News;
import com.tangzh.domain.NewsExample;
import com.tangzh.mapper.NewsMapper;
import com.tangzh.service.ITbNewsService;
/**
 * news service
 * @author tangzh
 *
 */
@Service("newsService")
public class ITbNewsServiceImpl implements ITbNewsService{
	@Resource
	NewsMapper newsMapper;
	@Override
	public News selectByPrimaryKey(Integer nid) {
		return newsMapper.selectByPrimaryKey(nid);
	}

	@Override
	public int countByExample(NewsExample example) {
		return newsMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(NewsExample example) {
		return newsMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer newsid) {

		return newsMapper.deleteByPrimaryKey(newsid);
	}

	@Override
	public int insert(News record) {

		return newsMapper.insert(record);
	}

	@Override
	public int insertSelective(News record) {

		return newsMapper.insertSelective(record);
	}

	@Override
	public List<News> selectByExample(NewsExample example) {

		return newsMapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(News record, NewsExample example) {

		return newsMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(News record, NewsExample example) {

		return newsMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(News record) {

		return newsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(News record) {

		return newsMapper.updateByPrimaryKey(record);
	}

}
