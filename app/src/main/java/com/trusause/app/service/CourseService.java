package com.trusause.app.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trusause.app.domain.Course;
import com.trusause.app.domain.Teacher;
import com.trusause.app.mapper.CourseMapper;
import com.trusause.app.mapper.TeacherMapper;
import com.trusause.app.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: weicl
 * @Date: 2019/6/25 9:16 AM
 * @Version 1.0
 * @Description ${description}
 */
@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    public Course selectByPrimaryKey(Integer id) {
        return courseMapper.selectByPrimaryKey(id);
    }
}
