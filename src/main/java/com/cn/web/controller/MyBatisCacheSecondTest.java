package com.cn.web.controller;

import com.cn.web.pojo.UserPojo;
import com.cn.web.service.IUserImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/13
 * Time:下午5:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml"})
public class MyBatisCacheSecondTest
{
   // private static final Logger logger = LoggerFactory.getLogger(MyBatisCacheSecondTest.class);

    @Autowired
    private IUserImpl iUser;

    /*
     * 二级缓存测试
     */
    @Test
    public void testCache2() throws Exception{
        UserPojo user =iUser.getUser("test","test");
        System.out.println(user.getUserName());
        UserPojo user1 =iUser.getUser("test","test");
        System.out.println(user1.getUserName());
        UserPojo user2 =iUser.getUser("test","test");
        System.out.println(user2.getUserName());
    }

}
