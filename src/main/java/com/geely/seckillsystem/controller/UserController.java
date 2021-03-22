package com.geely.seckillsystem.controller;

import com.geely.seckillsystem.pojo.User;
import com.geely.seckillsystem.service.IUserService;
import com.geely.seckillsystem.vo.JSonRespBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    //主页
    @RequestMapping("/home")
    public String home() {
        return "Home";
    }

    //根据 id,nickname 查询用户信息
    @RequestMapping("/getUser")
    public String getUser(/*@RequestParam("userId") */String id,
                          /*@RequestParam("userName")*/String nickname, Model model) {
        User user = new User();
        List<User> list =  userService.getUser(id, nickname);
        if(list == null || list.size() < 0) {
            for (int i = 0; i < 3; i++) {
                log.info("UserController get User error...");
            }
        }
        model.addAttribute("userList", list);
        model.addAttribute("user",user);
        log.info("UserController getUser info...");
        return "UserCreate";
    }

    @RequestMapping("/getTest")
    @ResponseBody
    public JSonRespBean getTest(@RequestParam("userId")String id,
                           @RequestParam("userName")String name) {
        id = "111";
        name = "222";
        return JSonRespBean.success();
    }


}
