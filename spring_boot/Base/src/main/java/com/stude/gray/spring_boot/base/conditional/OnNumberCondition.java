package com.stude.gray.spring_boot.base.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * Created on 2019/5/3.
 *
 * @author Grak
 * @since 1.0
 */
public class OnNumberCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnNumberProperty.class.getName());
        String propertyName = String.valueOf(attributes.get("name"));
        int propertyValue = (int)attributes.get("number");
        return propertyValue >= 10;
    }
}
