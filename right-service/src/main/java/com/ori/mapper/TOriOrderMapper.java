package com.ori.mapper;

import com.ori.pojo.TOriOrder;

public interface TOriOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(TOriOrder record);

    int insertSelective(TOriOrder record);

    TOriOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(TOriOrder record);

    int updateByPrimaryKey(TOriOrder record);
}