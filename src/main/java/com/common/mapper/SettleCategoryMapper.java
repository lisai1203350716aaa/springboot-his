package com.common.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SettleCategoryMapper {
    List<Map<String,Object>> getSettleCategory();
}
