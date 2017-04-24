package com.tangzh.mapper;

import com.tangzh.domain.News;
import com.tangzh.domain.NewsExample;
import com.tangzh.domain.NewsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(NewsKey key);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(NewsKey key);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}