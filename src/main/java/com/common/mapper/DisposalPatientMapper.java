package com.common.mapper;

import com.common.bean.RestBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DisposalPatientMapper {
    List<Map<String, Object>> getCheckPatient(String register_id);

    List<Map<String, Object>> getDisposalPatientEmp(String deptmentId);

    int updateDisposalPatient(String id,String employee_id);
}
