package com.geely.seckillsystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geely.seckillsystem.pojo.User;

import java.util.List;

/**
 * <p>w
 * 服务类
 * </p>
 *
 * @author qishun
 * @since 2021-03-01
 */

public interface IUserService extends IService<User> {

    List<User> getUser(String id, String nickname);

}
