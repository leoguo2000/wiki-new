package com.jiawa.wiki.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@ComponentScan("com.jiawa.wiki")

@RestController
public class TestController {
    @RequestMapping("/Hello")
    public String Hello(){
        return "Hello World!";
    }


}
