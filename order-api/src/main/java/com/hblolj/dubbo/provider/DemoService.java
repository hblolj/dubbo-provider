package com.hblolj.dubbo.provider;

import java.util.concurrent.CompletableFuture;

/**
 * @author: hblolj
 * @Date: 2019/6/28 15:10
 * @Description:
 * @Version:
 **/
public interface DemoService {

    String sayHello(String name);

    String sayBye(String name);

    CompletableFuture<String> anyncSayHello(String name);

}
