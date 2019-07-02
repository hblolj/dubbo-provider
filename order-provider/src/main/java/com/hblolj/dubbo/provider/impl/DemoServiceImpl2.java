package com.hblolj.dubbo.provider.impl;

import com.hblolj.dubbo.provider.DemoService;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author: hblolj
 * @Date: 2019/7/1 17:38
 * @Description:
 * @Version:
 **/
@Slf4j
public class DemoServiceImpl2 implements DemoService{

    public String sayHello(String name) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Instant.now());
        return "sayHello2";
    }

    public String sayBye(String name) {
//        String s = "1号服务: sayBye2";
        String s = "2号服务: sayBye2";
        return s;
    }

    // 服务端异步执行 -> 2.7.0 之后才支持, 2.6.x 下会报 CompletableFuture 无法序列化问题
    @Override
    public CompletableFuture<String> anyncSayHello(String name) {
        System.out.println("异步执行: " + Instant.now());
        return CompletableFuture.supplyAsync(() -> {
            log.info("进入异步方法");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "sayHello2InAsync!";
        });
    }
}
