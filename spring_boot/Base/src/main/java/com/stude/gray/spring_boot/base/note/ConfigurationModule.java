package com.stude.gray.spring_boot.base.note;

/**
 * Created on 2019/4/30.
 *
 * 标注在类上，代表当前类会以bean的形式存在容器里面
 * 本质功能没什么区别，只是所属功能区域的划分
 *
 * 扫描这些注解方式（手动装配）
 * 1、<context:component-scan>  xml里面
 * 2、@ComponentScan
 * @author Grak
 * @since 1.0
 */

import org.springframework.context.annotation.Configuration;

/**
 * 标记在配置类上面
 */
@Configuration
public class ConfigurationModule {

}
