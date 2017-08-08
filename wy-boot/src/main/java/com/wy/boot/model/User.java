package com.wy.boot.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id; //编号
    private String userName; //用户名
    private Integer age; //年龄
    private String password; //密码
    private Date createAt; //创建时间
    private Date updateAt; //更新时间
}
