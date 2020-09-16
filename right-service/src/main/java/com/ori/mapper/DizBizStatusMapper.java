package com.ori.mapper;

import com.ori.pojo.DizBizStatus;

public interface DizBizStatusMapper {

	int deleteByPrimaryKey(Integer statusId);

    int insert(DizBizStatus record);

    int insertSelective(DizBizStatus record);

    DizBizStatus selectByPrimaryKey(Integer statusId);

    int updateByPrimaryKeySelective(DizBizStatus record);

    int updateByPrimaryKey(DizBizStatus record);
}