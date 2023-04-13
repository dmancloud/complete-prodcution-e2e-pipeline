package com.dmancloud.dinesh.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoAppController {
    @GetMapping("/")
    public String hello() {
        return "Hello World! This is a sample application to demonstrate an end-2-end DevOps Pipeline";
    }
}
