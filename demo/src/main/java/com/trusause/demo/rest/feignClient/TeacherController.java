package com.trusause.demo.rest.feignClient;

import com.trusause.demo.client.TeacherClient;
import com.trusause.demo.dto.ResultDTO;
import com.trusause.demo.utils.RequestParamsMapToRequestMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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
    TeacherClient teacherClient;

    @GetMapping("/findById")
    public ResultDTO findById(HttpServletRequest httpServletRequest) {
        Map<String, Object> map = RequestParamsMapToRequestMap.getParameterMapCommon(httpServletRequest.getParameterMap());
        return teacherClient.TeacherController_findById(map);
    }

    @GetMapping("/findByOne")
    public ResultDTO findByOne(HttpServletRequest httpServletRequest) {
        Map<String, Object> map = RequestParamsMapToRequestMap.getParameterMapCommon(httpServletRequest.getParameterMap());
        return teacherClient.TeacherController_findByOne(map);
    }

}
