package com.geely.seckillsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.geely.seckillsystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author qishun
 * @since 2021-03-01
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> getUser(Map<String, String> parm);

}
