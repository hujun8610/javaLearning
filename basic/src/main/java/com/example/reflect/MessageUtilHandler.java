package com.example.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author hujun
 * @version 1.0.0
 * @ClassName MessageUtilHandler.java
 * @Description
 * @createTime 2020-03-30 15:27:00
 */

public class MessageUtilHandler {
    public void parse(Class<?> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //通过反射获取类
        final Object object = clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
        final Method[] methods = clazz.getDeclaredMethods();
        for(final Method method:methods){
            MessageUtil messageUtil = method.getAnnotation(MessageUtil.class);
            if(null!=messageUtil){
                //方法调用
                method.invoke(object,messageUtil.message());
            }
        }
    }

}
