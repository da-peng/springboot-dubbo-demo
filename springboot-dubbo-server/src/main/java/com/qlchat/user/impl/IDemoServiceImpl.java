package com.qlchat.user.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qlchat.user.api.IDemoService;


/**
 * @author grabbywu
 * @Title: springboot-dubbo-user
 * @Package com.qlchat.user.impl
 * @Description: todo
 * @date 6/26/184:23 PM
 */

@Service( version = "1.0.0" )
public class IDemoServiceImpl implements IDemoService {


    public String sayHi(String name) {

        return "Hello, " + name + " (from Spring Boot)";
    }
}
