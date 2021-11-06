package com.hsj.service;

import com.hsj.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author system
 * @since 2021-08-12
 */
public interface UserService extends IService<User> {
    /**
     * @Description:id获取
     * @author HeShengjin 2356899074@qq.com
     * @date 2021/8/12 17:53
     */
    User getById(Long id);
}
