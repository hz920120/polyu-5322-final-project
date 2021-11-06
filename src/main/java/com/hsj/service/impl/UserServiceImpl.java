package com.hsj.service.impl;

import com.hsj.entity.User;
import com.hsj.mapper.UserMapper;
import com.hsj.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author system
 * @since 2021-08-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     * @param id
     * @Description:id获取
     * @author HeShengjin 2356899074@qq.com
     * @date 2021/8/12 17:53
     */
    @Override
    public User getById(Long id) {
        return baseMapper.selectById(id);
    }
}
