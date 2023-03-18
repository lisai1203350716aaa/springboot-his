package com.common.mapper;

import com.common.bean.RestBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PrescriptionMapper {
    Integer addDrugMsgToPre(Map<String,Object> map);

    List<Map<Object,Object>> getDrugByregisterId(Map<Object,Object> map);

    List<Map<String,Object>> searchDrugByRegisterIdAndName(String real_name,String case_number,Integer nowPageNumber,Integer pageSize);

    Integer getDrugPatientCount(String real_name,String case_number);

    Integer updateDrugState(String id);
}

