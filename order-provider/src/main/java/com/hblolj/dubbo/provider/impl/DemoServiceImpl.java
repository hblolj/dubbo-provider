package com.hblolj.dubbo.provider.impl;


import com.hblolj.dubbo.provider.DemoService;

/**
 * @author: hblolj
 * @Date: 2019/6/28 15:11
 * @Description:
 * @Version:
 **/
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayBye(String name) {
        return "Bye " + name;
    }
}
