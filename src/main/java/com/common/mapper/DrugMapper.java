package com.common.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
public interface DrugMapper {
    List<Map<String,Object>> getDrug();
}
