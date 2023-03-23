package com.gcc.gccmap.service.impl;

import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.mapper.ClassroomMapper;
import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.model.dto.ClassroomDTO;
import com.gcc.gccmap.model.vo.ClassroomDel;
import com.gcc.gccmap.service.ClassroomService;
import com.gcc.gccmap.util.JwtUtil;
import com.gcc.gccmap.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Resource
    private ClassroomMapper classroomMapper;

    @Resource
    private RedisCache redisCache;

    @Override
    public List<ClassroomDTO> queryClassroomByBuildingId(Integer buildingId) {
        return null;
    }

    @Transactional
    @Override
    public ResponseResult updateClassByBuildingIdAndClassId(ClassroomDTO classroom) {
        Map<String,Object> map = new HashMap<>();
        map.put("newToken", JwtUtil.flushToken(redisCache));
        if(classroomMapper.updateClassByBuildingIdAndClassId(classroom)==1)
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(), "更新教室信息成功",map);
        return new ResponseResult(ResponseStatus.FAIL.getCode(), "更新教室信息失败",map);
    }

    @Transactional
    @Override
    public ResponseResult insertClassroom(ClassroomDTO classroom) { ///需要判断数据库主键是否已经存在
        Map<String,Object> map = new HashMap<>();
        map.put("newToken", JwtUtil.flushToken(redisCache));
        if(classroomMapper.insertClassroom(classroom)==1)
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(), "增加教室成功",map);
        return new ResponseResult(ResponseStatus.FAIL.getCode(), "增加教室失败",map);
    }

    @Transactional
    @Override
    public ResponseResult deleteClassroom(ClassroomDel classroom) {
        Map<String,Object> map = new HashMap<>();
        map.put("newToken", JwtUtil.flushToken(redisCache));
        if(classroomMapper.deleteClassroom(classroom)==1)
            return new ResponseResult(ResponseStatus.SUCCESS.getCode(), "删除教室成功",map);
        return new ResponseResult(ResponseStatus.FAIL.getCode(), "删除教室失败",map);
    }
}
