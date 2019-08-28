package com.trusause.app.rest;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.trusause.app.domain.Teacher;
import com.trusause.app.dto.ResultDTO;
import com.trusause.app.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: weicl
 * @Date: 2019/6/20 7:40 PM
 * @Version 1.0
 * @Description ${description}
 */
@Slf4j
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/findById")
    public ResultDTO findById(Integer id) {
        Teacher teacher = teacherService.findById(id);
        return ResultDTO.builder().data(teacher).build();
    }

    @GetMapping("/findByOne")
    public ResultDTO findByOne(Integer id) {
        Teacher teacher = teacherService.findByOne(id);
        return ResultDTO.builder().data(teacher).build();
    }

    @GetMapping("/findByOneUseMybqtis")
    public ResultDTO findByOneUseMybqtis(Integer id) {
        Teacher teacher = teacherService.sel(id);
        return ResultDTO.builder().data(teacher).build();
    }

    @GetMapping("/findByCodeUseMybqtis")
    public ResultDTO findByCodeUseMybqtis(String code) {
        Teacher teacher = teacherService.selectByCode(code);
        return ResultDTO.builder().data(teacher).build();
    }

    @GetMapping("/findByNameUseMybqtisWithPage")
    public ResultDTO findByNameUseMybqtis(Teacher teacher) {
        PageInfo<Teacher> teacherList = teacherService.selectByName(teacher);
        return ResultDTO.builder().data(teacherList).build();
    }
}
