package com.common.mapper;

import com.common.bean.RestBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CheckRequestMapper {
    void insertCheckRequest(String register_id,
                                String medical_technology_id,
                                String check_info,
                                String check_position,
                                String check_remark);
}
