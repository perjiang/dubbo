package com.sczy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sczy.service.helloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test/")
public class helloController {
    @Reference
    private helloService helloService;

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(String name){
        return helloService.sayHello(name);

    }
}
