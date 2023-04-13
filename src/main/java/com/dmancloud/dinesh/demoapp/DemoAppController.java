package com.dmancloud.dinesh.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoAppController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World! This is a sample application to demonstrate an end-2-end DevOps Pipeline");
        return "index";
    }

    @GetMapping("/error")
    public String handleError() {
        return "error";
    }
}

