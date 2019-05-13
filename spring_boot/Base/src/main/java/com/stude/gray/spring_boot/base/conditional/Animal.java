package com.stude.gray.spring_boot.base.conditional;

import org.springframework.stereotype.Component;

/**
 * Created on 2019/5/3.
 *
 * @author Grak
 * @since 1.0
 */
@Component
@ConditionalOnNumberProperty(name = "土耳其",number = 11)
public class Animal {

    private String name = "土耳其";

    @Override
    public String toString() {
        return name;
    }
}
