package com.pjb.ssm.service;

import com.pjb.ssm.entity.UserInfo;

/**
 * 用户信息业务逻辑接口
 * @author pan_junbiao
 **/
public interface UserService
{
    /**
     * 查询用户
     */
    public UserInfo getUserById(int userId);

    /**
     * 新增用户
     */
    public int addUser(UserInfo userInfo);

    /**
     * 修改用户
     */
    public int updateUser(UserInfo userInfo);

    /**
     * 删除用户
     */
    public int deleteUser(int userId);
}
