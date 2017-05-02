package com.tangzh.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tangzh.domain.AdminLog;
import com.tangzh.domain.AdminLogExample;

public interface ITbAdminLogService {
    public int countByExample(AdminLogExample example);

    public int deleteByExample(AdminLogExample example);

    public int deleteByPrimaryKey(Integer lid);

    public int insert(AdminLog record);

    public int insertSelective(AdminLog record);

    public List<AdminLog> selectByExample(AdminLogExample example);

    public AdminLog selectByPrimaryKey(Integer lid);

    public int updateByExampleSelective(@Param("record") AdminLog record, @Param("example") AdminLogExample example);

    public int updateByExample(@Param("record") AdminLog record, @Param("example") AdminLogExample example);

    public int updateByPrimaryKeySelective(AdminLog record);

    public int updateByPrimaryKey(AdminLog record);
}
