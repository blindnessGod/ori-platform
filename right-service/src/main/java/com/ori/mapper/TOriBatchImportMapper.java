package com.ori.mapper;

import com.ori.pojo.TOriBatchImport;

public interface TOriBatchImportMapper {
    int insert(TOriBatchImport record);

    int insertSelective(TOriBatchImport record);
}