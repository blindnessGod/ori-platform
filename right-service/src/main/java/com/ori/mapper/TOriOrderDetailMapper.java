package com.ori.mapper;

import com.ori.pojo.TOriOrderDetail;

public interface TOriOrderDetailMapper {
    int deleteByPrimaryKey(String orderDetailId);

    int insert(TOriOrderDetail record);

    int insertSelective(TOriOrderDetail record);

    TOriOrderDetail selectByPrimaryKey(String orderDetailId);

    int updateByPrimaryKeySelective(TOriOrderDetail record);

    int updateByPrimaryKey(TOriOrderDetail record);
}