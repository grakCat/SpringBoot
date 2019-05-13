package com.stude.gray.spring_boot.base.note;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 2019/5/3.
 *
 * @author Grak
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
@Import(MyImportSelector.class)
public @interface MyNote {

    /**
     * ElementType
     * TYPE 类, 接口 (包括注释类型), 或 枚举 声明
     * FIELD 字段声明（包括枚举常量）
     * METHOD 方法声明
     * PARAMETER  正式的参数声明
     * CONSTRUCTOR 构造函数声明
     * LOCAL_VARIABLE  局部变量声明
     * ANNOTATION_TYPE 注释类型声明
     */

    /**
     * RetentionPolicy
     * SOURCE 源文件保留
     * CLASS class保留
     * RUNTIME 运行时保留
     */

    /**
     * @Documented  贴了这个注解之后,就会生成对应的javadoc的文档
     */

}
