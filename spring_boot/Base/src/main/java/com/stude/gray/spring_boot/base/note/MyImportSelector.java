package com.stude.gray.spring_boot.base.note;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created on 2019/5/3.
 *
 * @author Grak
 * @since 1.0
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        String[] strs = new String[]{Cat.class.getName()};
        return strs;
    }
}
