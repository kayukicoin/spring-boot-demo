package com.kayukicoin.spring.listener.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListenerDemoController {
    @GetMapping("/demo/hello")
    public String hello(){
        return "hello world";
    }
}
