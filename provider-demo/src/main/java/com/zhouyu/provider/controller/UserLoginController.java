package com.zhouyu.provider.controller;

import com.zhouyu.provider.api.UserLoginApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周宇
 * @version 1.0 date: 2019/8/2 14:26
 * @description:
 * @Copyright (C), 2017-2019, 深圳市⾦证引擎科技股份有限公司
 */
@RestController
public class UserLoginController implements UserLoginApi {

  @Override
  public String getUser() {
    return "zhouyu";
  }
}
