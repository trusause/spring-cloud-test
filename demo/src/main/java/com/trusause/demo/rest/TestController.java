package com.trusause.demo.rest;

import com.trusause.demo.domain.Student;
import com.trusause.demo.dto.ResultDTO;
import com.trusause.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.nio.charset.Charset;

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

    public void createHtml() throws Exception{
        String downloadTempPath = "temp/download/";
        File file = new File(downloadTempPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        File tmpfile = new File(downloadTempPath + "test" + ".html");

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost("");
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(60000).setSocketTimeout(120000).build();
        httpPost.setConfig(requestConfig);
        FileBody bin = new FileBody(tmpfile);
        HttpEntity req = MultipartEntityBuilder.create()
                .setCharset(Charset.forName("utf-8"))
                .setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
                .addPart("file", bin).build();
        httpPost.setEntity(req);
        System.out.println("executing request " + httpPost.getRequestLine());
        CloseableHttpResponse response = httpClient.execute(httpPost);
        System.out.println(response.getStatusLine());
        HttpEntity res = response.getEntity();

        EntityUtils.consume(res);
        response.close();
        httpClient.close();
        tmpfile.delete();
    }

}
