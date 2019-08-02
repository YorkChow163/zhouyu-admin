package com.zhouyu.provider.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 周宇
 * @version 1.0 date: 2019/8/2 14:43
 * @description:
 * @Copyright (C), 2017-2019, 深圳市⾦证引擎科技股份有限公司
 */
@FeignClient(value = "provider-demo")
public interface UserLoginApi {

  @GetMapping
  String getUser();
}
