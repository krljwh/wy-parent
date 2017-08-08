package com.wy.boot.service.impl;

import com.wy.boot.dao.UserDao;
import com.wy.boot.service.UserService;
import com.wy.boot.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserVO detail(Integer id) {
        if (id == null) {
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userDao.getUserById(id), userVO);
        log.debug("request parameter : {}, return value : {}",id,userVO);
        return userVO;
    }
}
