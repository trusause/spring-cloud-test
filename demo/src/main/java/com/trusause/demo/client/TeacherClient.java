package com.trusause.demo.client;

import com.trusause.demo.dto.ResultDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author: weicl
 * @Date: 2019/6/27 3:49 PM
 * @Version 1.0
 * @Description ${description}
 */
@FeignClient(name = "app")
public interface TeacherClient {

    @GetMapping(value = "/teacher/findById")
    ResultDTO TeacherController_findById(@RequestParam Map<String, Object> params);

    @GetMapping(value = "/teacher/findByOne")
    ResultDTO TeacherController_findByOne(@RequestParam Map<String, Object> params);

}
