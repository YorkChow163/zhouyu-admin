package com.zhouyu.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 周宇
 * @version 1.0 date: 2019/8/2 14:29
 * @description:
 * @Copyright (C), 2017-2019, 深圳市⾦证引擎科技股份有限公司
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerApplication.class, args);
  }
}
