package com.trusause.app.rest;

import com.github.pagehelper.PageInfo;
import com.trusause.app.domain.Course;
import com.trusause.app.domain.Teacher;
import com.trusause.app.dto.ResultDTO;
import com.trusause.app.service.CourseService;
import com.trusause.app.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/insert")
    public ResultDTO insert(@RequestBody Course record) {
        return ResultDTO.builder().data(courseService.insert(record)).build();
    }

    @PostMapping("/insertSelective")
    public ResultDTO insertSelective(@RequestBody Course record) {
        return ResultDTO.builder().data(courseService.insertSelective(record)).build();
    }

    @PutMapping("/updateByPrimaryKey")
    public ResultDTO updateByPrimaryKey(@RequestBody Course record) {
        return ResultDTO.builder().data(courseService.updateByPrimaryKey(record)).build();
    }

    @PutMapping("/updateByPrimaryKeySelective")
    public ResultDTO updateByPrimaryKeySelective(@RequestBody Course record) {
        return ResultDTO.builder().data(courseService.updateByPrimaryKeySelective(record)).build();
    }

    @DeleteMapping("/deleteByPrimaryKey")
    public ResultDTO deleteByPrimaryKey(Integer id) {
        return ResultDTO.builder().data(courseService.deleteByPrimaryKey(id)).build();
    }

}
