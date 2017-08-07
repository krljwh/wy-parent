package com.wy.web.service.impl;

import com.wy.web.dao.UserDao;
import com.wy.web.service.UserService;
import com.wy.web.vo.UserVO;
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
        log.debug("id:{},user:{}",id,userVO);
        return userVO;
    }
}
