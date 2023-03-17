package com.common.mapper;

import com.common.bean.RestBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MedicalRecordMapper {
    //添加病例首页信息
    int addHomeMedicalRecord(Map<String,Object> map);
    //添加病例关联信息
    int addMedicalRecordDisease(Map<String,Object> map);

    Integer updatepatientDiagnosis(String register_id, String diagnosis, String cure);
}
