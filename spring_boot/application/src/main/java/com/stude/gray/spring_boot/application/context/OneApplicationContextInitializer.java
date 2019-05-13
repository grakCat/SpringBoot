package com.stude.gray.spring_boot.application.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * TODO...
 *
 * @author 小马哥
 * @since 2018/5/17
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class OneApplicationContextInitializer<C extends ConfigurableApplicationContext>
        implements ApplicationContextInitializer<C> {
    @Override
    public void initialize(C applicationContext) {
        System.out.println("One ApplicationContext.id = "+ applicationContext.getId());
    }
}
