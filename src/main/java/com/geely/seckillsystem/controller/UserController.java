package com.geely.seckillsystem.controller;

import com.geely.seckillsystem.pojo.User;
import com.geely.seckillsystem.service.IUserService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author qishun
 * @since 2021-03-01
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/webtest")
    public String webtest(Model model) {
        //测试前端交互
        String str = "用户信息";
        model.addAttribute("name", str);
        return "webtest";
    }

    @RequestMapping("/getUser")
    public String getUser(String id, String nickname) {
        List<User> list =  userService.getUser(id, nickname);
        return "User";
    }

}
