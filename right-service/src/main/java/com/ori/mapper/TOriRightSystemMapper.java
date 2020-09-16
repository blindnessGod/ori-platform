package com.ori.mapper;

import com.ori.pojo.TOriRightSystem;

public interface TOriRightSystemMapper {
    int deleteByPrimaryKey(Integer rightSystemId);

    int insert(TOriRightSystem record);

    int insertSelective(TOriRightSystem record);

    TOriRightSystem selectByPrimaryKey(Integer rightSystemId);

    int updateByPrimaryKeySelective(TOriRightSystem record);

    int updateByPrimaryKey(TOriRightSystem record);
}