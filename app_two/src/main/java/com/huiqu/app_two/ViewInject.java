package com.huiqu.app_two;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME) @Target(TYPE)
public @interface ViewInject {
    int mainlayoutid() default -1;
}
