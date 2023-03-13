package com.common.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface RegisterMapper {
    int addRegister(Map<String,Object> map);

    int getFinishPatientCount(Integer employee_id);

    Integer getWaitPatientCount(@Param("employee_id") Integer employee_id,
                                @Param("case_number") String case_number,
                                @Param("real_name") String real_name);

    List<Map<String, Object>> getWaitPatientMsg(@Param("employee_id") Integer employee_id,
                                                @Param("case_number") String case_number,
                                                @Param("real_name") String real_name,
                                                @Param("nowPageNumber") Integer nowPageNumber,
                                                @Param("pageSize") Integer pageSize);

    List<Map<String,Object>> searchRegister(Map<Object, Object> map);
}
