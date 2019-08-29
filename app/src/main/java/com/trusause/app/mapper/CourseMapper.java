package com.trusause.app.mapper;

import com.trusause.app.domain.Course;
import com.trusause.app.mapper.common.CommMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper extends CommMapper<Course> {

    List<Course> findAll();


    int deleteByPrimaryKeyOwner(Integer id);

    @Override
    int insert(Course record);

    @Override
    int insertSelective(Course record);

    Course selectByPrimaryKeyOwner(Integer id);

    @Override
    int updateByPrimaryKeySelective(Course record);

    @Override
    int updateByPrimaryKey(Course record);
}