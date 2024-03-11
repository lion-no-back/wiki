package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Songguo
 * @date 2024/3/6 14:56
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @Value("${test.hello:TEST}")
    public String testHello;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post," + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
