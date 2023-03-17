package com.common.mapper;

import com.common.bean.RestBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DisponsalRequestMapper {
    void insertDisponsal(String register_id, String medical_technology_id, String disposal_info, String disposal_position, String disposal_remark);

    List<Map<Object, Object>> getDisponsalRequestByregisterId(Map<Object, Object> map);

    int updateStatesById(Object id);

    Integer getFinishDisposalCount();

    Integer getWaitDisposalCount();

    List<Map<String, Object>> getWaitDisposalMsg(String case_number,
                                                 String real_name,
                                                 Integer nowPageNumber,
                                                 Integer pageSize);


    List<Map<String, Object>> getDisposalPatientDept();

    List<Map<String,Object>> searchDisposaledPatient(String case_number, String real_name);

    List<Map<String, Object>> selectionDisposalInput(String id);

    Integer updateDisposalInput(String id, String disposal_result, String inputdisposal_employee_id);

    List<Map<String, Object>> getDisposalPatientTableByregist(String register_id, Integer nowPageNumber, Integer pageSize);

    Integer getDisposalPatientTableByregistCount(String register_id);
}
