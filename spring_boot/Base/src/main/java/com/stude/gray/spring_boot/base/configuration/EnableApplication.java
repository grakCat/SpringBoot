package com.stude.gray.spring_boot.base.conditional;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ComponentScan指定扫描范围
 */
@SpringBootApplication
public class NoteApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(NoteApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        Animal module = (Animal)context.getBean("animal");
        System.out.println(module.toString());
        // 关闭上下文
        context.close();
    }
}
