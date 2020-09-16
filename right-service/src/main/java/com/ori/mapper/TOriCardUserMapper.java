package com.ori.mapper;

import com.ori.pojo.TOriCardUser;

public interface TOriCardUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(TOriCardUser record);

    int insertSelective(TOriCardUser record);

    TOriCardUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TOriCardUser record);

    int updateByPrimaryKey(TOriCardUser record);
}