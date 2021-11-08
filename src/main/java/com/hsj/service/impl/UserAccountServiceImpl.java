package com.hsj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsj.entity.UserAccount;
import com.hsj.entity.request.LoginReq;
import com.hsj.entity.request.RegisterReq;
import com.hsj.mapper.UserAccountMapper;
import com.hsj.service.UserAccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author HUANG Zuo
 * @version create_time：2021-11-08 18:53:14
 * @declaration
 * @e-mail hz920120@gmail.com
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {
    @Override
    public Boolean isUserAccountExist(String username) {
        QueryWrapper<UserAccount> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(UserAccount::getUsername, username);
        List<UserAccount> list = baseMapper.selectList(queryWrapper);
        //if exists, return true, otherwise return false
        return !CollectionUtils.isEmpty(list);
    }

    @Override
    public Boolean register(RegisterReq req) {
        UserAccount userAccount = new UserAccount();
        BeanUtils.copyProperties(req, userAccount);
        int res = baseMapper.insert(userAccount);
        return res == 1;
    }

    @Override
    public Boolean login(LoginReq req) {
        String password = req.getPassword();
        QueryWrapper<UserAccount> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(UserAccount::getUsername, req.getUsername());
        UserAccount userAccount = baseMapper.selectOne(queryWrapper);
        return password.equals(userAccount.getPassword());
    }
}

