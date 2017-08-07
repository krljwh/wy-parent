package com.wy.web.service;

import com.wy.web.vo.UserVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-core.xml", "classpath:spring/spring-mvc.xml"})
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testDetail() {
        UserVO userVO = userService.detail(1);
        System.out.println(userVO);
        Assert.assertEquals("张三", userVO.getUserName());
    }
}
