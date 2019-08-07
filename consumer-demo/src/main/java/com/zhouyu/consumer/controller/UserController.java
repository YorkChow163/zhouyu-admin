package com.zhouyu.consumer.controller;

import com.zhouyu.dubbo.api.UserServiceApi;
import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周宇
 * @version 1.0 date: 2019/8/2 14:55
 * @description: 服务消费者
 * @Copyright (C), 2017-2019, 深圳市⾦证引擎科技股份有限公司
 */
@RestController
@RequestMapping("/user")
@Log4j2
public class UserController {

  @Reference
  UserServiceApi userServiceApi;

  @RequestMapping(value = "/infos/name", method = RequestMethod.GET)
  public void getUserInfo(@PathVariable("name") String name) {
    String providerReturn = userServiceApi.echo(name);
    log.info("消费者,response:{}", providerReturn);
  }

}
