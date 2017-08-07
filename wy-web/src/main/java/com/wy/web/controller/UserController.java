package com.wy.web.controller;

import com.wy.web.service.UserService;
import com.wy.web.util.Result;
import com.wy.web.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public Result<UserVO> detail(@RequestParam("id") Integer id) {
        return Result.ok(userService.detail(id));
    }
}