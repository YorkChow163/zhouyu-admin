package com.example.zhouyu.controller;

import com.example.zhouyu.pojo.User;
import com.example.zhouyu.vo.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String tologin() {
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public R toIndex(@RequestBody User user) {
        System.out.println("user" + user);
       //return "redirect:/index.html";
        return R.ok();
    }
}
