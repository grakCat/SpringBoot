package com.stude.gray.spring_boot.base.configuration;

import com.stude.gray.spring_boot.base.conditional.ConditionalOnNumberProperty;
import com.stude.gray.spring_boot.base.note.MyNote;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 2019/5/3.
 *
 * @author Grak
 * @since 1.0
 */
@Configuration  //模式注解
@MyNote //装配bean
@ConditionalOnNumberProperty(name = "自动装配",number = 11)//判断条件
public class MyAutoConfiguration {
}
