package com.trusause.demo.rest;

import com.trusause.demo.domain.Student;
import com.trusause.demo.dto.ResultDTO;
import com.trusause.demo.service.StudentService;
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
@RequestMapping("/student")
public class TestController {

    @Autowired
    StudentService studentService;

    @GetMapping("/create")
    public ResultDTO create() {
        studentService.create(Student.builder().code("F172723").name("韦昌龙").build());
        return ResultDTO.builder().build();
    }

}
