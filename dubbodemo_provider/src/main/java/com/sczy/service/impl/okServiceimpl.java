package com.sczy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sczy.service.okService;
@Service
public class okServiceimpl implements okService {
    @Override
    public String sayHello(String hello) {
        return "444"+ hello;
    }
}
