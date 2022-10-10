package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/Hello")
    public String Hello(){
        return "Hello World!";
    }


}
