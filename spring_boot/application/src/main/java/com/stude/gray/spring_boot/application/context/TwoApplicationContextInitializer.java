package com.stude.gray.spring_boot.application.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * After OneApplicationContextInitializer
 *
 * @author 小马哥
 * @since 2018/5/17
 */
public class TwoApplicationContextInitializer implements ApplicationContextInitializer, Ordered {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("Two application.id = " + applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
