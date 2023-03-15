package com.common.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DisposalPatientMapper {
    List<Map<String, Object>> getCheckPatient(String register_id);
}
