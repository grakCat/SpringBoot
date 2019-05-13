package com.stude.gray.spring_boot.application;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created on 2019/5/3.
 *
 * @author Grak
 * @since 1.0
 */
@SpringBootApplication
public class ApplicationBuilderDemo {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationBuilderDemo.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .web(WebApplicationType.NONE)
                .profiles("Cat","Dog")
                .headless(true)
                .run(args);
    }
}
