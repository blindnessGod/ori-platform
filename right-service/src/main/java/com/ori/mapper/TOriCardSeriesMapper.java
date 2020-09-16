package com.ori.mapper;

import com.ori.pojo.TOriCardSeries;

public interface TOriCardSeriesMapper {
    int deleteByPrimaryKey(Integer seriesId);

    int insert(TOriCardSeries record);

    int insertSelective(TOriCardSeries record);

    TOriCardSeries selectByPrimaryKey(Integer seriesId);

    int updateByPrimaryKeySelective(TOriCardSeries record);

    int updateByPrimaryKey(TOriCardSeries record);
}