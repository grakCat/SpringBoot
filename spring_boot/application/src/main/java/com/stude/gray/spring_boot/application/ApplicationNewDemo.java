package com.stude.gray.spring_boot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class ApplicationNewDemo {

    public static void main(String[] args) {
//        SpringApplication.run(MyApplication.class, args);
        Set<String> sources = new HashSet<>();
        sources.add(MyApplication.class.getName());

        SpringApplication application = new SpringApplication();
        application.setSources(sources);//添加bean
        //REACTIVE和SERVLET都有时会使用SERVLET
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.setAdditionalProfiles("Cat","Dog");//添加profile
        ConfigurableApplicationContext context = application.run(args);
        System.out.println("bean: " + context.getBean(MyApplication.class));
    }

    @SpringBootApplication
    public static class MyApplication{ }

}
