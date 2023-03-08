package com.common.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface RegisterMapper {
    int addRegister(Map<String,Object> map);

    int getFinishPatientCount();
}
