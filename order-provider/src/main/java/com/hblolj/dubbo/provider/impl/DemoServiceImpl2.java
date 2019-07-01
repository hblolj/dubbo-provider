package com.hblolj.dubbo.provider.impl;

import com.hblolj.dubbo.provider.DemoService;

/**
 * @author: hblolj
 * @Date: 2019/7/1 17:38
 * @Description:
 * @Version:
 **/
public class DemoServiceImpl2 implements DemoService{

    public String sayHello(String name) {
        return "sayHello2";
    }

    public String sayBye(String name) {
        return "sayBye2";
    }
}
