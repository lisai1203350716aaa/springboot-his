package com.common.mapper;

import com.common.bean.RestBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
public interface DrugMapper {
    List<Map<String,Object>> getDrug();

    List<Map<String,Object>> searchDrug(String drug_name, String drug_code);
}
