package com.ori.mapper;

import com.ori.pojo.TOriDownOrderDetail;

public interface TOriDownOrderDetailMapper {
    int deleteByPrimaryKey(String orderDetailId);

    int insert(TOriDownOrderDetail record);

    int insertSelective(TOriDownOrderDetail record);

    TOriDownOrderDetail selectByPrimaryKey(String orderDetailId);

    int updateByPrimaryKeySelective(TOriDownOrderDetail record);

    int updateByPrimaryKey(TOriDownOrderDetail record);
}