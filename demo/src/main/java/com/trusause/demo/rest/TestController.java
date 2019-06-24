package com.trusause.demo.rest;

import lombok.extern.slf4j.Slf4j;
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
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test1")
    public String test1() {
        log.info("...");
        return "test1";
    }

}
