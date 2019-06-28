package com.hblolj.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: hblolj
 * @Date: 2019/6/28 16:38
 * @Description:
 * @Version:
 **/
@Configuration
@EnableDubbo(scanBasePackages = "com.hblolj.dubbo.provider.impl")
@ComponentScan("com.hblolj.dubbo.provider")
@PropertySource("classpath:/provider.properties")
public class ProviderConfiguration {
}
