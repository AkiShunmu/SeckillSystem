package com.geely.seckillsystem.controller;

import com.alibaba.fastjson.JSONArray;
import com.geely.seckillsystem.pojo.User;
import com.geely.seckillsystem.service.IUserService;
import com.sun.net.httpserver.HttpExchange;
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
    private HttpExchange request;

    @RequestMapping("/webtest")
    public String webtest(Model model) {
        //测试前端交互
        String str = "用户信息";
        model.addAttribute("name", str);
        return "webtest";
    }

    //根据 id,nickname 查询用户信息
    @RequestMapping("/getUser")
    public String getUser(String id, String nickname) {
        List<User> list =  userService.getUser(id, nickname);
        JSONArray.toJSONString(list);
        return "User";
    }

}
