package com.tangzh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tangzh.domain.Notice;
import com.tangzh.domain.NoticeExample;
import com.tangzh.mapper.NoticeMapper;
import com.tangzh.service.ITbNoticeService;
@Service("noticeService")
public class ITbNoticeServiceImpl implements ITbNoticeService {
	@Resource
	NoticeMapper noticeMapper;
	@Override
	public int countByExample(NoticeExample example) {
		
		return noticeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(NoticeExample example) {
		
		return noticeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer nid) {
		
		return noticeMapper.deleteByPrimaryKey(nid);
	}

	@Override
	public int insert(Notice record) {
		
		return noticeMapper.insert(record);
	}

	@Override
	public int insertSelective(Notice record) {
		
		return noticeMapper.insertSelective(record);
	}

	@Override
	public List<Notice> selectByExample(NoticeExample example) {
		
		return noticeMapper.selectByExample(example);
	}

	@Override
	public Notice selectByPrimaryKey(Integer nid) {
		
		return noticeMapper.selectByPrimaryKey(nid);
	}

	@Override
	public int updateByExampleSelective(Notice record, NoticeExample example) {
		
		return noticeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Notice record, NoticeExample example) {
		
		return noticeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Notice record) {
		
		return noticeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Notice record) {
		
		return noticeMapper.updateByPrimaryKey(record);
	}

}
