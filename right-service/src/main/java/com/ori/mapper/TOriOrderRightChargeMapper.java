package com.ori.mapper;

import com.ori.pojo.TOriOrderRightCharge;

public interface TOriOrderRightChargeMapper {
    int deleteByPrimaryKey(Integer chargeId);

    int insert(TOriOrderRightCharge record);

    int insertSelective(TOriOrderRightCharge record);

    TOriOrderRightCharge selectByPrimaryKey(Integer chargeId);

    int updateByPrimaryKeySelective(TOriOrderRightCharge record);

    int updateByPrimaryKey(TOriOrderRightCharge record);
}