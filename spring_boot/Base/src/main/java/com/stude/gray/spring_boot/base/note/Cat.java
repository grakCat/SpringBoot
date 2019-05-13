package com.stude.gray.spring_boot.base.note;

import org.springframework.context.annotation.Bean;

/**
 * Created on 2019/5/3.
 *
 * @author Grak
 * @since 1.0
 */
public class Cat {

    private String name = "Cat";

    @Bean
    public Cat myCat(){
        return new Cat();
    }

    @Bean
    public Dog myDog(){
        return new Dog();
    }
}
