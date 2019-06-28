package com.hblolj.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @auther Ori
 * @Date 2019/6/13 23 03
 * @Description
 */
public class App {

    public static void main(String[] args) throws IOException {
//        Main.main(args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
