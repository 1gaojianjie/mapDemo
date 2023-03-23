package com.gcc.gccmap.service;

import com.gcc.gccmap.model.entity.SportsField;
import com.gcc.gccmap.model.vo.LocationInfo;
import com.gcc.gccmap.util.ResponseResult;

public interface SportsFieldService {
    ResponseResult querySportsFieldInfo(LocationInfo locationInfo);

    ResponseResult updateSportsFieldInfo(SportsField sportsField);
}
