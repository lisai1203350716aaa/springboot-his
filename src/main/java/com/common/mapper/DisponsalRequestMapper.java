package com.common.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DisponsalRequestMapper {
    void insertDisponsal(String register_id, String medical_technology_id, String disposal_info, String disposal_position, String disposal_remark);

    List<Map<Object, Object>> getDisponsalRequestByregisterId(Map<Object,Object> map);
}
