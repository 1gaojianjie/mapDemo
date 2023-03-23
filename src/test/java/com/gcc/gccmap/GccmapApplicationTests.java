package com.gcc.gccmap;

import com.gcc.gccmap.mapper.ClassroomMapper;
import com.gcc.gccmap.mapper.PermissionMapper;
import com.gcc.gccmap.model.dto.ClassroomDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GccmapApplicationTests {
    @Autowired
    private ClassroomMapper classroomMapper;

    @Autowired
    private PermissionMapper permissionMapper;


    @Test
    void contextLoads() {
//        System.out.println(classroomMapper.insertClassroom(new ClassroomDTO(566, 12, "鸿蒙研究院", 9, 9)));
        System.out.println(classroomMapper.updateClassByBuildingIdAndClassId(new ClassroomDTO(566, 12, "高健杰研究院", 9, 99)));
    }

    @Test
    public void queryTest(){
        String userType = permissionMapper.queryUserType("2");
        System.out.println(userType);
    }

}
