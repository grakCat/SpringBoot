package com.stude.gray.spring_boot.base.profile;

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
                .profiles("Dog")
                .run(args);
        CalculateService module = context.getBean(CalculateService.class);
        System.out.println("calculateService.sum(1...10) : " +
                module.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // 关闭上下文
        context.close();
    }
}
