package com.common.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DepartmentMapper {
    //得到所有科室
    List<Map<String,Object>> getAlldeptList();

    List<Map<String, Object>> getCheckPatientDept();
}
