package com.qlchat.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qlchat.user.api.IDemoService;
import org.springframework.stereotype.Component;

/**
 * @author grabbywu
 * @Title: springboot-dubbo-demo
 * @Package com.qlchat.demo
 * @Description: todo
 * @date 6/28/183:23 PM
 */
@Component
public class TestController {

    @Reference(version = "1.0.0")
    private IDemoService demoService;

    public void printHi() {
        System.out.println(demoService.sayHi("da-penng"));
    }


}
