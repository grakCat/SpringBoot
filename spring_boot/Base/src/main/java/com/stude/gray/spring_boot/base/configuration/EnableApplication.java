package com.stude.gray.spring_boot.base.configuration;

import com.stude.gray.spring_boot.base.note.Cat;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ComponentScan指定扫描范围
 */
@EnableAutoConfiguration
public class EnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        Cat module = (Cat)context.getBean("myCat");
        System.out.println(module.toString());
        // 关闭上下文
        context.close();
    }
}
