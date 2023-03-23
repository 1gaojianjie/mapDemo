package com.gcc.gccmap.service.impl;

import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.mapper.CanteenMapper;
import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.exception.CanteenNotExistException;
import com.gcc.gccmap.model.dto.CanteenDTO;
import com.gcc.gccmap.model.dto.CanteenInfoDTO;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.service.CanteenService;
import com.gcc.gccmap.util.JwtUtil;
import com.gcc.gccmap.util.ResponseResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class CanteenServiceImpl implements CanteenService {
    @Resource
    private CanteenMapper canteenMapper;

    @Resource
    private RedisCache redisCache;

    /**
     * @param locationInfo
     * @return
     */
    //查询饭堂详细信息
    @Override
    public ResponseResult queryCanteenInfo(LocationInfo locationInfo) {
        CanteenInfoDTO canteen = canteenMapper.queryCanteenInfo(locationInfo);
        if (Objects.isNull(canteen))
            throw new CanteenNotExistException("该饭堂不存在！");

        Map<String, Object> map = new HashMap<>();
        map.put("canteen", canteen);
        map.put("newToken", JwtUtil.flushToken(redisCache));
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(), ResponseStatus.SUCCESS.getMessage(), map);
    }

    @Override
    public ResponseResult queryCanteen(LocationInfo locationInfo) {
        CanteenDTO canteen = canteenMapper.queryCanteen(locationInfo);
        if (Objects.isNull(canteen))
            throw new CanteenNotExistException("该饭堂不存在！");

        Map<String, Object> map = new HashMap<>();
        map.put("canteen", canteen);
        map.put("newToken", JwtUtil.flushToken(redisCache));
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(), ResponseStatus.SUCCESS.getMessage(), map);
    }

    @Transactional
    @Override
    public ResponseResult updateCanteenInfo(CanteenDTO canteenDTO) {
        Map<String, Object> map = new HashMap<>();
        map.put("newToken", JwtUtil.flushToken(redisCache));
        if (canteenMapper.updateCanteenInfo(canteenDTO) == 1)
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(), "更新饭堂数据成功", map);
        return new ResponseResult(ResponseStatus.FAIL.getCode(), "更新饭堂数据失败", map);
    }
}
