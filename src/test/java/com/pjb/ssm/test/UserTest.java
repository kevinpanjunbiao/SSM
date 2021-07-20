package com.pjb.ssm.test;

import com.pjb.ssm.entity.UserInfo;
import com.pjb.ssm.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用户业务测试类
 * @author pan_junbiao
 **/
public class UserTest
{
    private ApplicationContext applicationContext;
    private UserService userService;

    @Before
    public void setUp() throws Exception
    {
        //初始化Spring容器（上下文对象）
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
        //获取Bean对象
        userService = (UserService) applicationContext.getBean("userServiceImpl");
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("测试完成！");
    }

    /**
     * 修改用户
     */
    @Test
    public void updateUser()
    {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(1);
        userInfo.setUserName("pan_junbiao的博客");
        userInfo.setBlogUrl("https://blog.csdn.net/pan_junbiao");
        userInfo.setSex(2);
        userInfo.setProvinceName("广东省");
        userInfo.setHobby("篮球;足球;羽毛球;乒乓球;游泳");
        userInfo.setRemark("您好，欢迎访问 pan_junbiao的博客");
        //调用业务逻辑层方法，执行修改操作
        int result = userService.updateUser(userInfo);

        //打印结果
        if(result>0)
        {
            System.out.println("修改成功");
        }
        else
        {
            System.out.println("修改失败");
        }
    }

    /**
     * 删除用户
     */
    @Test
    public void deleteUser()
    {
        //调用业务逻辑层方法，执行删除操作
        int result = userService.deleteUser(1);

        //打印结果
        if(result>0)
        {
            System.out.println("删除成功");
        }
        else
        {
            System.out.println("删除失败");
        }
    }
}
