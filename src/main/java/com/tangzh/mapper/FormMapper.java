package com.tangzh.mapper;

import com.tangzh.domain.Form;
import com.tangzh.domain.FormExample;
import com.tangzh.domain.FormKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormMapper {
    int countByExample(FormExample example);

    int deleteByExample(FormExample example);

    int deleteByPrimaryKey(FormKey key);

    int insert(Form record);

    int insertSelective(Form record);

    List<Form> selectByExample(FormExample example);

    Form selectByPrimaryKey(FormKey key);

    int updateByExampleSelective(@Param("record") Form record, @Param("example") FormExample example);

    int updateByExample(@Param("record") Form record, @Param("example") FormExample example);

    int updateByPrimaryKeySelective(Form record);

    int updateByPrimaryKey(Form record);
}