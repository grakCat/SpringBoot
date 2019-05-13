package com.stude.gray.spring_boot.base.note;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ComponentScan指定扫描范围
 */
//@ImportResource("classpath:spring.xml")
@MyNote
public class NoteApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(NoteApplication.class, args);
        Object module = context.getBean("myDog");
        System.out.println(module.toString());
    }
}
