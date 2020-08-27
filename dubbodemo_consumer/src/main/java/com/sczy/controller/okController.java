package com.sczy.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.sczy.service.okService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/say/")
public class okController {
    @Reference
    private okService service;

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(String name){
        return service.sayHello(name);

    }

}
