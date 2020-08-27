package com.sczy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sczy.service.helloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = helloService.class)
@Transactional
public class helloServiceimpl implements helloService {
    @Override
    public String sayHello(String name) {
        return "11 hello"+name;
    }
}
