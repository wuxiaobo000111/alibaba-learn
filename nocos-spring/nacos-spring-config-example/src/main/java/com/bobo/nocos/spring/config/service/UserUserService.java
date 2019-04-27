package com.bobo.nocos.spring.config.service;

import com.bobo.nocos.spring.config.shopping.bean.UserUser;
import com.bobo.nocos.spring.config.shopping.mapper.UserUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * useruser service
 * @create 2019-01-12 11:02
 **/
@Service
public class UserUserService {

    @Autowired
    private UserUserMapper userUserMapper;


    public UserUser getUserInfo(Integer id) {
        UserUser user = userUserMapper.selectByPrimaryKey(id);
        return user;
    }
}
