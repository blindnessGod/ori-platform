package com.ori.mapper;

import com.ori.pojo.TOriCardProd;

public interface TOriCardProdMapper {
    int deleteByPrimaryKey(Integer prodId);

    int insert(TOriCardProd record);

    int insertSelective(TOriCardProd record);

    TOriCardProd selectByPrimaryKey(Integer prodId);

    int updateByPrimaryKeySelective(TOriCardProd record);

    int updateByPrimaryKey(TOriCardProd record);
}