package com.example.reflect;

import java.lang.annotation.*;

/**
 * @author hujun
 * @version 1.0.0
 * @ClassName MessageUtil.java
 * @Description
 * @createTime 2020-03-30 15:21:00
 */
@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MessageUtil {
    String message() default "hello";
}
