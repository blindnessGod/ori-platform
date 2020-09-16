package com.ori.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ori.pojo.DicBizScenarioscol;

@Mapper
public interface DicBizScenarioscolMapper {

	int deleteByPrimaryKey(@Param("bizId")Integer bizId);

    int insert(DicBizScenarioscol record);

    int insertSelective(DicBizScenarioscol record);

    DicBizScenarioscol selectByPrimaryKey(Integer bizId);

    int updateByPrimaryKeySelective(DicBizScenarioscol record);

    int updateByPrimaryKey(DicBizScenarioscol record);
    
    DicBizScenarioscol selectByBizCd(@Param("bizCd")String bizCd);
    
}