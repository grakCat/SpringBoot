package com.stude.gray.spring_boot.base.conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Created on 2019/5/3.
 *
 * @author Grak
 * @since 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnNumberCondition.class)
public @interface ConditionalOnNumberProperty {

    String name();

    int number();
}
