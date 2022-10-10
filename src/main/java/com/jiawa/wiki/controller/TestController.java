package com.jiawa.wiki.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/Hello")/*浏览器默认使用get请求 如果更改访问方法（post） 会有405错误*/
    public String Hello(){
        return "Hello World!";
    }


}
