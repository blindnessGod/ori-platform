package com.ori.mapper;

import com.ori.pojo.TOriCardChannelRight;

public interface TOriCardChannelRightMapper {
    int deleteByPrimaryKey(Integer channelRightId);

    int insert(TOriCardChannelRight record);

    int insertSelective(TOriCardChannelRight record);

    TOriCardChannelRight selectByPrimaryKey(Integer channelRightId);

    int updateByPrimaryKeySelective(TOriCardChannelRight record);

    int updateByPrimaryKey(TOriCardChannelRight record);
}