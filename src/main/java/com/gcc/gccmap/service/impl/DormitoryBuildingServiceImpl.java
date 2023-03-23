package com.gcc.gccmap.service.impl;

import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.mapper.DormitoryBuildingMapper;
import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.exception.BuildingNotExistException;
import com.gcc.gccmap.model.dto.DormitoryBuildingDTO;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.service.DormitoryBuildingService;
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
public class DormitoryBuildingServiceImpl implements DormitoryBuildingService {
    @Resource
    private DormitoryBuildingMapper dormitoryBuildingMapper;

    @Resource
    private RedisCache redisCache;

    @Override
    public ResponseResult queryDormitoryBuilding(LocationInfo locationInfo) {
        DormitoryBuildingDTO dormitoryBuilding = dormitoryBuildingMapper.queryDormitoryBuilding(locationInfo);
        if(Objects.isNull(dormitoryBuilding))
            throw new BuildingNotExistException("体育场所不存在");
        Map<String,Object> map = new HashMap<>();
        map.put("sportsField",dormitoryBuilding);
        map.put("newToken", JwtUtil.flushToken(redisCache));
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(),ResponseStatus.SUCCESS.getMessage(),map);
    }

    @Transactional
    @Override
    public ResponseResult updateDormitoryInfo(DormitoryBuildingDTO dormitoryBuildingDTO) {
        Map<String,Object> map = new HashMap<>();
        map.put("newToken", JwtUtil.flushToken(redisCache));
        if(dormitoryBuildingMapper.updateDormitoryInfo(dormitoryBuildingDTO)==1)
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(),"更新公寓数据成功",map);
        return new ResponseResult(ResponseStatus.FAIL.getCode(),"更新公寓数据失败",map);
    }
}
