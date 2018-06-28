package com.qlchat.demo.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author grabbywu
 * @Title: springboot-dubbo-demo
 * @Package com.qlchat.demo
 * @Description: todo
 * @date 6/28/183:25 PM
 */
@Configuration
@ImportResource("classpath:dubbo-consumer.xml")
public class DubboConfig {

}
