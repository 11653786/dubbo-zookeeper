package com.yt.dubbo.startdubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class Provider {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        context.start();
        try {
            System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
        } catch (IOException e) {
            e.printStackTrace();
        }
//        UserService userService=context.getBean(UserService.class);
//        userService.hello("heheheh");
//        System.out.println("--------------------------------dubbo----------------------------------------------------");
    }

}
