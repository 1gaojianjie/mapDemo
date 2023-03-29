package com.gcc.gccmap.util;

import com.gcc.gccmap.exception.ParameterExceptions;
import com.gcc.gccmap.model.vo.LocationInfo;

public class CheckParamUtil {
    public static LocationInfo checkLocation(String left,String top){
        Integer lt = null;
        Integer tp = null;
        try {
            lt = Integer.valueOf(left);
            tp = Integer.valueOf(top);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new ParameterExceptions("参数异常");
        }
        return new LocationInfo(lt,tp);
    }
}
