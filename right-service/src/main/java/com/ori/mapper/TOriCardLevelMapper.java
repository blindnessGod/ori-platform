package com.ori.mapper;

import com.ori.pojo.TOriCardLevel;

public interface TOriCardLevelMapper {
    int deleteByPrimaryKey(Integer levelId);

    int insert(TOriCardLevel record);

    int insertSelective(TOriCardLevel record);

    TOriCardLevel selectByPrimaryKey(Integer levelId);

    int updateByPrimaryKeySelective(TOriCardLevel record);

    int updateByPrimaryKey(TOriCardLevel record);
}