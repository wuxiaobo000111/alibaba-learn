package com.bobo.nocos.spring.config.controller;

import com.bobo.common.uitl.JsonMapper;
import com.bobo.nocos.spring.config.service.UserUserService;
import com.bobo.nocos.spring.config.shopping.bean.UserUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * useruser controller
 * @author wuxiaobo@didachuxing.com
 * @create 2019-01-12 11:03
 **/
@Controller(value = "user")
@RequestMapping(produces="application/json;charset=UTF-8")
public class UserUserController {

    @Autowired
    private UserUserService userUserService;

    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public String getUserInfo( Integer id) {
        UserUser user = userUserService.getUserInfo(id);
        return JsonMapper.toJson(user);
    }
}
