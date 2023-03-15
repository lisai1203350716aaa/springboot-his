package com.common.mapper;

import com.common.bean.RestBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface PhysicianMapper {

    List<Map<String,Object>> getPhysicianByDeptIdAndRegistId(String deptmentId, String registLevelId);


}
