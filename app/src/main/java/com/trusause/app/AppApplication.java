package com.trusause.app;

import com.trusause.app.mapper.common.CommMapper;
//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(value = "com.trusause.app.mapper", markerInterface = CommMapper.class)//扫描的mapper
@EnableDiscoveryClient
//@EnableFeignClients
@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
