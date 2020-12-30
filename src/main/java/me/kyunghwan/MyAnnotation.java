package me.kyunghwan;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD })
@Inherited
public @interface MyAnnotation {

    String value() default "kyunghwan";

    int number() default 100;

}
