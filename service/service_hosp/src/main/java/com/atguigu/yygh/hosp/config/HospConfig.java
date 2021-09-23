package com.atguigu.yygh.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @FileName: HospConfig
 * @Author: SunJian
 * @Date: 2021/9/23 下午11:18
 * @Description: mapper配置类：由于mapper动态创建所以需要这个配置类。或者在启动类上加@MapperScan注解
 */
@Configuration
@MapperScan("com.atguigu.yygh.hosp.mapper")
public class HospConfig {
}