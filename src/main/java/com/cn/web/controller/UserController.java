package com.cn.web.controller;

import com.cn.web.pojo.UserPojo;
import com.cn.web.service.IUserImpl;
import com.cn.web.service.UserImpl;
import com.cn.web.util.SpringContextHolder;
import com.cn.web.util.page.IPageImpl;
import com.cn.web.util.page.PageBaseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
/**
 * Describe:用户控制层
 * User:tangjing
 * Date:17/1/13
 * Time:下午2:22
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    PageBaseUtil pageBaseUtil;

    @Autowired
    private IUserImpl iUser;

    private static final String url="user/";

    @RequestMapping("/list.htm")
    public String toUserList(Model model) throws Exception
    {
        return url+"list";
    }


    @RequestMapping("/tableDemoAjax.json")
    @ResponseBody
    public String tableDemoAjax(@RequestParam String aoData) throws Exception {
        return iUser.queryUserListPage(aoData);

    }

}
