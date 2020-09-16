package com.ori.mapper;

import com.ori.pojo.TOriCardSeriesRight;

public interface TOriCardSeriesRightMapper {
    int deleteByPrimaryKey(Integer seriesRightId);

    int insert(TOriCardSeriesRight record);

    int insertSelective(TOriCardSeriesRight record);

    TOriCardSeriesRight selectByPrimaryKey(Integer seriesRightId);

    int updateByPrimaryKeySelective(TOriCardSeriesRight record);

    int updateByPrimaryKey(TOriCardSeriesRight record);
}