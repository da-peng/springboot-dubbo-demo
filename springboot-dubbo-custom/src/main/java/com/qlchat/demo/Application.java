package com.qlchat.demo;


import com.qlchat.demo.controller.TestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		TestController service = ctx.getBean(TestController.class);
		service.printHi();

	}
}
