package com.wy.boot.service;


import com.wy.boot.vo.UserVO;

public interface UserService {

    /**
     * 根据用户编号获取用户详细信息
     *
     * @param id 用户编号
     * @return
     */
    UserVO detail(Integer id);
}