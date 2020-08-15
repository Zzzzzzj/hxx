package org.xx.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xx.demo.service.TestService;

/**
 * @author Pitttttt
 * @Classname TestController
 * @Description TODO
 * @Date 2020/8/5 21:38
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value = "/test")
    public String test(){
        System.out.println("test");
        return testService.testInterface();
    }
}
