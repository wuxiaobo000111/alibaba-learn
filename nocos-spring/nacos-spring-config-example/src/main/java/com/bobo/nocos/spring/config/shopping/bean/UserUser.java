package com.bobo.nocos.spring.config.shopping.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* Created by Mybatis Generator 2019/01/12
*/
@Data
public class UserUser implements Serializable {
    /**
	* 主键Id
	*/
    private Integer id;

    private String cid;

    private String phone;

    private String nickName;

    /**
	* 性别
	*/
    private Byte gender;

    private String imgUrl;

    /**
	* 年龄
	*/
    private Integer age;

    private String email;

    private Date createTime;

    /**
	* 状态，0正常，1代表异常，可能有扩展
	*/
    private Integer status;

    private String lastName;

    private String firstName;

    private static final long serialVersionUID = 1L;
}