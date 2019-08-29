package com.trusause.app.rest;

import com.github.pagehelper.PageInfo;
import com.trusause.app.domain.Teacher;
import com.trusause.app.dto.ResultDTO;
import com.trusause.app.service.CourseService;
import com.trusause.app.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weicl
 * @Date: 2019/6/20 7:40 PM
 * @Version 1.0
 * @Description ${description}
 */
@Slf4j
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/selectByPrimaryKey")
    public ResultDTO selectByPrimaryKey(Integer id) {
        return ResultDTO.builder().data(courseService.selectByPrimaryKey(id)).build();
    }

}
