package com.zhouyu.consumer.controller;

import com.zhouyu.provider.api.UserLoginApi;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 周宇
 * @version 1.0 date: 2019/8/2 14:55
 * @description:
 * @Copyright (C), 2017-2019, 深圳市⾦证引擎科技股份有限公司
 */
@Controller
@Log4j2
public class UserController {

  @Autowired
  private UserLoginApi userLoginApi;

  @RequestMapping(value = "/user", method = RequestMethod.GET)
  public void getUserInfo() {
    String user = userLoginApi.getUser();
    log.info("provider,user:{}", user);
  }

}
