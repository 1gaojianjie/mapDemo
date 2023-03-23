package com.gcc.gccmap.service.impl;

import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.mapper.TeachingBuildingMapper;
import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.exception.BuildingNotExistException;
import com.gcc.gccmap.model.dto.TeachingBuildingDTO;
import com.gcc.gccmap.model.dto.TeachingBuildingInfoDTO;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.service.TeachingBuildingService;
import com.gcc.gccmap.util.JwtUtil;
import com.gcc.gccmap.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class TeachingBuildingServiceImpl implements TeachingBuildingService {
    @Resource
    private TeachingBuildingMapper teachingBuildingMapper;

    @Resource
    private RedisCache redisCache;

    @Override
    public ResponseResult queryTeachingBuilding(LocationInfo locationInfo) {
        TeachingBuildingDTO teachingBuilding = teachingBuildingMapper.queryTeachingBuilding(locationInfo);
        if(Objects.isNull(teachingBuilding))
            throw new BuildingNotExistException("建筑不存在");

        Map<String,Object> map = new HashMap<>();
        map.put("teachingBuilding",teachingBuilding);
        map.put("newToken", JwtUtil.flushToken(redisCache));
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(),ResponseStatus.SUCCESS.getMessage(),map);
    }

    @Override
    public ResponseResult queryTeachingBuildingInfo(LocationInfo locationInfo) {
        TeachingBuildingInfoDTO teachingBuildingInfo = teachingBuildingMapper.queryTeachingBuildingInfo(locationInfo);
        if(Objects.isNull(teachingBuildingInfo))
            throw new BuildingNotExistException("建筑不存在");
        Map<String,Object> map = new HashMap<>();
        map.put("teachingBuilding",teachingBuildingInfo);
        map.put("newToken", JwtUtil.flushToken(redisCache));
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(),ResponseStatus.SUCCESS.getMessage(),map);
    }

    @Transactional
    @Override
    public ResponseResult updateBuildingInfo(TeachingBuildingDTO teachingBuilding) {
        Map<String,Object> map = new HashMap<>();
        map.put("newToken", JwtUtil.flushToken(redisCache));
        if(teachingBuildingMapper.updateBuildingInfo(teachingBuilding)==1)
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(),"更新教学楼数据成功",map);
        return new ResponseResult(ResponseStatus.FAIL.getCode(),"更新教学楼数据失败",map);
    }
}
