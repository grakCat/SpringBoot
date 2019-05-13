package com.stude.gray.spring_boot.application.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * HelloWorld {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * @author 小马哥
 * @since 2018/5/17
 */
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("HelloWorld : " + event.getApplicationContext().getId()
                + " , timestamp : " + event.getTimestamp());
    }
}
