package me.kyunghwan;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD })
@Inherited
public @interface AnohterAnnotation {

    String value() default "another kyunghwan";

    int number() default 1100;

}
