package com.pjb.ssm.service.impl;

import com.pjb.ssm.dao.UserDao;
import com.pjb.ssm.entity.UserInfo;
import com.pjb.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息业务逻辑类
 * @author pan_junbiao
 **/
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    /**
     * 查询用户
     */
    public UserInfo getUserById(int userId)
    {
        return userDao.getUserById(userId);
    }

    /**
     * 新增用户
     */
    public int addUser(UserInfo userInfo)
    {
        return userDao.addUser(userInfo);
    }

    /**
     * 修改用户
     */
    public int updateUser(UserInfo userInfo)
    {
        return userDao.updateUser(userInfo);
    }

    /**
     * 删除用户
     */
    public int deleteUser(int userId)
    {
        return userDao.deleteUser(userId);
    }
}
