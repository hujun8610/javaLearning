package com.example.reflect;

/**
 * @author hujun
 * @version 1.0.0
 * @ClassName Main.java
 * @Description
 * @createTime 2020-03-30 15:21:00
 */
public class Main {
    @MessageUtil(message = "测试")
    public static void sayHello(String name){
        System.out.println("hello " + name + " say hello");
    }

    @MessageUtil(message = "测试HI")
    public static void sayHi(String name){
        System.out.println("Hi "+ name +" say hi");
    }


    public static void main(String[] args) throws Exception{
        MessageUtilHandler handler = new MessageUtilHandler();
        handler.parse(Main.class);


    }

}
