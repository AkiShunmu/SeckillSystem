package com.geely.seckillsystem.controller;

import com.alibaba.fastjson.JSONArray;
import com.geely.seckillsystem.pojo.User;
import com.geely.seckillsystem.service.IUserService;
import com.sun.net.httpserver.HttpExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    private final Logger log = LoggerFactory.getLogger(UserController.class);

    //网页连接测试：成功
    @RequestMapping("/webtest")
    public String webtest(Model model) {
        //测试前端交互
        String str = "用户信息";
        model.addAttribute("name", str);
        return "webtest";
    }

    //根据 id,nickname 查询用户信息
    @RequestMapping("/getUser")
    public String getUser(String id, String nickname, Model model) {
        User user = new User();
        List<User> list =  userService.getUser(id, nickname);
        model.addAttribute("userList", list);
        model.addAttribute("user",user);
        log.info("UserController getUser info...");
        return "User";
    }


}
