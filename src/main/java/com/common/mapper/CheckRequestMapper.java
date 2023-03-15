package com.common.mapper;

import com.common.bean.RestBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CheckRequestMapper {
    void insertCheckRequest(String register_id,
                                String medical_technology_id,
                                String check_info,
                                String check_position,
                                String check_remark);

    List<Map<Object, Object>> getCheckRequestByregisterId(Map<Object, Object> map);

    int updateStatesById(Object id);

    List<Map<String,Object>> getWaitCheckMsg(
                                             @Param("case_number") String case_number,
                                             @Param("real_name") String real_name,
                                             @Param("nowPageNumber") Integer nowPageNumber,
                                             @Param("pageSize") Integer pageSize);
    Integer getFinishCheckCount();

    Integer getWaitCheckCount();

}
