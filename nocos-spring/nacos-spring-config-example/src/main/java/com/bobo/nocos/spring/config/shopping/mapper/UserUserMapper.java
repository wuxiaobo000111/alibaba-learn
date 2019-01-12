package com.bobo.nocos.spring.config.shopping.mapper;

import com.bobo.nocos.spring.config.shopping.bean.UserUser;

/**
* Created by Mybatis Generator 2019/01/12
*/
public interface UserUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserUser record);

    int insertSelective(UserUser record);

    UserUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserUser record);

    int updateByPrimaryKey(UserUser record);
}