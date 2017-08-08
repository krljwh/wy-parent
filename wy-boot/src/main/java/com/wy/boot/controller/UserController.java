package com.wy.boot.controller;

import com.wy.boot.service.UserService;
import com.wy.boot.util.Result;
import com.wy.boot.vo.UserVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public Result<UserVO> detail(@RequestParam("id") Integer id) {
        return Result.ok(userService.detail(id));
    }
}