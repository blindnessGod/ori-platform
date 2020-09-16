package com.ori.mapper;

import com.ori.pojo.TOriField;

public interface TOriFieldMapper {
    int deleteByPrimaryKey(Integer fieldId);

    int insert(TOriField record);

    int insertSelective(TOriField record);

    TOriField selectByPrimaryKey(Integer fieldId);

    int updateByPrimaryKeySelective(TOriField record);

    int updateByPrimaryKey(TOriField record);
}