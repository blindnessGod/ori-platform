package com.ori.mapper;

import com.ori.pojo.TOriCardProdRight;

public interface TOriCardProdRightMapper {
    int deleteByPrimaryKey(Integer prodRightId);

    int insert(TOriCardProdRight record);

    int insertSelective(TOriCardProdRight record);

    TOriCardProdRight selectByPrimaryKey(Integer prodRightId);

    int updateByPrimaryKeySelective(TOriCardProdRight record);

    int updateByPrimaryKey(TOriCardProdRight record);
}