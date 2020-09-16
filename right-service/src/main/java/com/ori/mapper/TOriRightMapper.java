package com.ori.mapper;

import com.ori.pojo.TOriRight;

public interface TOriRightMapper {
    int deleteByPrimaryKey(Integer rightId);

    int insert(TOriRight record);

    int insertSelective(TOriRight record);

    TOriRight selectByPrimaryKey(Integer rightId);

    int updateByPrimaryKeySelective(TOriRight record);

    int updateByPrimaryKey(TOriRight record);
}