package com.ori.mapper;

import com.ori.pojo.TOriDownOrder;

public interface TOriDownOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(TOriDownOrder record);

    int insertSelective(TOriDownOrder record);

    TOriDownOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(TOriDownOrder record);

    int updateByPrimaryKey(TOriDownOrder record);
}