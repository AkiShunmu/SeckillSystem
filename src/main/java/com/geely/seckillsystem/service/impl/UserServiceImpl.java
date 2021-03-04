package com.geely.seckillsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.geely.seckillsystem.mapper.UserMapper;
import com.geely.seckillsystem.pojo.User;
import com.geely.seckillsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author qishun
 * @since 2021-03-01
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser(String id, String nickname) {
        Map<String, String> parm = new HashMap();
        parm.put("id", id);
        parm.put("nickname", nickname);
        return userMapper.getUser(parm);
    }
}
