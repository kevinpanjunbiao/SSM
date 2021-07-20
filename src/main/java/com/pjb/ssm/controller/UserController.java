package com.pjb.ssm.controller;

import com.pjb.ssm.entity.UserInfo;
import com.pjb.ssm.model.UserModel;
import com.pjb.ssm.service.UserService;
import com.pjb.ssm.util.UtilHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户信息控制器
 * @author pan_junbiao
 **/
@Controller
@RequestMapping("user")
public class UserController
{
@Autowired
private UserService userService;

/**
 * 用户注册页面
 */
@RequestMapping("toUserRegisterView")
public String toUserRegisterView()
{
    return "/user_register.jsp";
}

/**
 * 新增用户
 */
@RequestMapping("addUser")
public ModelAndView addUser(UserModel userModel)
{
    ModelAndView modelAndView = new ModelAndView();

    //参数验证
    if (userModel.getUserName() == null || userModel.getUserName().equals(""))
    {
        modelAndView.addObject("message", "参数错误");
        modelAndView.setViewName("/error.jsp");
        return modelAndView;
    }

    //将Model对象转换为实体对象
    UserInfo userInfo = new UserInfo();
    userInfo.setUserName(userModel.getUserName());
    userInfo.setBlogUrl(userModel.getBlogUrl());
    userInfo.setSex(userModel.getSex());
    userInfo.setProvinceName(userModel.getProvinceName());
    userInfo.setHobby(UtilHelper.arrToStr(userModel.getHobbyArray(), ";"));
    userInfo.setRemark(userModel.getRemark());

    //调用业务逻辑层方法，执行新增操作
    int resultExecute = userService.addUser(userInfo);

    //返回结果页面
    if (resultExecute > 0)
    {
        modelAndView.addObject("message", "新增用户成功");
        modelAndView.setViewName("/success.jsp");
    }
    else
    {
        modelAndView.addObject("message", "新增用户失败");
        modelAndView.setViewName("/error.jsp");
    }
    return modelAndView;
}

/**
 * 用户详情页面
 */
@RequestMapping("toUserDetailView")
public ModelAndView toUserDetailView(@RequestParam(value="user_id",defaultValue="0") int userId)
{
    ModelAndView modelAndView = new ModelAndView();

    //获取用户信息
    UserInfo userInfo = userService.getUserById(userId);
    if(userInfo==null)
    {
        modelAndView.addObject("message","未找到用户信息");
        modelAndView.setViewName("/error.jsp");
        return modelAndView;
    }

    //用户实体对象转换为Model对象
    UserModel userModel = new UserModel();
    userModel.setUserId(userInfo.getUserId());
    userModel.setUserName(userInfo.getUserName());
    userModel.setBlogUrl(userInfo.getBlogUrl());
    userModel.setSex(userInfo.getSex());
    userModel.setProvinceName(userInfo.getProvinceName());
    userModel.setHobbyStr(userInfo.getHobby());
    userModel.setRemark(userInfo.getRemark());

    //返回结果
    modelAndView.addObject("userModel",userModel);
    modelAndView.setViewName("/user_detail.jsp");
    return modelAndView;
}
}
