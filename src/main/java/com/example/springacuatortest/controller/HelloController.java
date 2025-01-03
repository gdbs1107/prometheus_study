package com.example.springacuatortest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private int i = 0; // 멤버 변수로 i를 선언하여 값을 유지1

    @GetMapping("/hello")
    public String hello() {
        i++; // 호출될 때마다 i를 증가시킴
        return "hello " + i;
    }
}
