package org.xx.demo.controller;

import org.apache.coyote.InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xx.demo.service.TestService;

import java.io.*;

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
    public String test() {
        System.out.println("test");
        return testService.testInterface();
    }

    @GetMapping(value = "/getTxt")
    public ResponseEntity<FileSystemResource> getTt(String path) throws IOException {
        return ResponseEntity.ok().body(new FileSystemResource(path));
    }
}
