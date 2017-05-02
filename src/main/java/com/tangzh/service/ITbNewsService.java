package com.tangzh.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tangzh.domain.News;
import com.tangzh.domain.NewsExample;

/**
 * 
 * @author tangzh
 *
 */
public interface ITbNewsService {
	/**
	 * 
	 * @param nid
	 * @return
	 */
	public News selectByPrimaryKey(Integer nid);
	
	public int countByExample(NewsExample example);

    public int deleteByExample(NewsExample example);

    public int deleteByPrimaryKey(Integer newsid);

    public int insert(News record);

    public int insertSelective(News record);

    public List<News> selectByExample(NewsExample example);

    public int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    public int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    public int updateByPrimaryKeySelective(News record);

    public int updateByPrimaryKey(News record);
}
