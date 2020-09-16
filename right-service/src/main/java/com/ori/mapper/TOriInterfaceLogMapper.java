package com.ori.mapper;

import com.ori.pojo.TOriInterfaceLog;

public interface TOriInterfaceLogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(TOriInterfaceLog record);

    int insertSelective(TOriInterfaceLog record);

    TOriInterfaceLog selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(TOriInterfaceLog record);

    int updateByPrimaryKeyWithBLOBs(TOriInterfaceLog record);

    int updateByPrimaryKey(TOriInterfaceLog record);
}