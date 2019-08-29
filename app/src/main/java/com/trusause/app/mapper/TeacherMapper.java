package com.trusause.app.mapper;

import com.trusause.app.domain.Teacher;
import com.trusause.app.mapper.common.CommMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: weicl
 * @Date: 2019/7/29 11:20 AM
 * @Version 1.0
 * @Description ${description}
 */
@Repository
public interface TeacherMapper extends CommMapper<Teacher> {

    Teacher sel(@Param("id") int id);

    Teacher selectByCode(@Param("code") String code);

    List<Teacher> selectByName(Teacher teacher);

    int insertWithPrimaryKey(Teacher teacher);
}
