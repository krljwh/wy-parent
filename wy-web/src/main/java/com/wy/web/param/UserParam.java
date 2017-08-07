package com.wy.web.param;

import lombok.Data;

@Data
public class UserParam {
    private Integer id; //编号
    private String userName; //用户名
    private Integer age; //年龄
    private String password; //密码
}
