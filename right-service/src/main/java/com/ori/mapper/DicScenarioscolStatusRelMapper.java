package com.ori.mapper;

import com.ori.pojo.DicScenarioscolStatusRel;

public interface DicScenarioscolStatusRelMapper {
    int deleteByPrimaryKey(Integer ssId);

    int insert(DicScenarioscolStatusRel record);

    int insertSelective(DicScenarioscolStatusRel record);

    DicScenarioscolStatusRel selectByPrimaryKey(Integer ssId);

    int updateByPrimaryKeySelective(DicScenarioscolStatusRel record);

    int updateByPrimaryKey(DicScenarioscolStatusRel record);
}