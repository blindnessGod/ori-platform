package com.ori.mapper;

import com.ori.pojo.TOriCardChannel;

public interface TOriCardChannelMapper {
    int deleteByPrimaryKey(Integer channelId);

    int insert(TOriCardChannel record);

    int insertSelective(TOriCardChannel record);

    TOriCardChannel selectByPrimaryKey(Integer channelId);

    int updateByPrimaryKeySelective(TOriCardChannel record);

    int updateByPrimaryKey(TOriCardChannel record);
}