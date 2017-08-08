package com.wy.web.controller;

import com.wy.web.service.UserService;
import com.wy.web.util.Result;
import com.wy.web.vo.UserVO;
import org.springframework.web.bind.annotation.*;

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