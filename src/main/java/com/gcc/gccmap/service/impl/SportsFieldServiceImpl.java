package com.gcc.gccmap.service.impl;

import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.mapper.SportsFieldMapper;
import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.exception.BuildingNotExistException;
import com.gcc.gccmap.model.dto.SportsFieldDTO;
import com.gcc.gccmap.model.entity.SportsField;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.service.SportsFieldService;
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
public class SportsFieldServiceImpl implements SportsFieldService {
    @Resource
    private SportsFieldMapper sportsFieldMapper;

    @Resource
    private RedisCache redisCache;

    @Override
    public ResponseResult querySportsFieldInfo(LocationInfo locationInfo) {
        SportsFieldDTO sportsFieldInfo = sportsFieldMapper.querySportsFieldInfo(locationInfo);
        if(Objects.isNull(sportsFieldInfo))
            throw new BuildingNotExistException("体育场所不存在");
        Map<String,Object> map = new HashMap<>();
        map.put("sportsField",sportsFieldInfo);
        map.put("newToken", JwtUtil.flushToken(redisCache));
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(),ResponseStatus.SUCCESS.getMessage(),map);
    }

    @Transactional
    @Override
    public ResponseResult updateSportsFieldInfo(SportsField sportsField) {
        Map<String,Object> map = new HashMap<>();
        map.put("newToken", JwtUtil.flushToken(redisCache));
        if(sportsFieldMapper.updateSportsFieldInfo(sportsField)==1)
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(), "修改体育场所信息成功",map);
        return new ResponseResult(ResponseStatus.FAIL.getCode(), "修改体育场所信息失败",map);
    }
}
