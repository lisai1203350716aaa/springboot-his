package com.common.mapper;

import com.common.bean.RestBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface MedicalTechnologyMapper {
    List<Map<String,Object>> getCheck(Map<String,Object> map);


}
