package com.cn.web.controller;

import com.cn.web.pojo.UserPojo;
import com.cn.web.service.ISysImpl;
import com.cn.web.service.IUserImpl;
import com.cn.web.util.Global;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/10
 * Time:下午4:17
 */

@Controller
public class LoginController {

    @Autowired
    private IUserImpl iUserImpl;
    @Autowired
    private ISysImpl iSysImpl;

    @RequestMapping( {"/login.htm","/"})
    public String doLogin(HttpServletRequest request, String userName, String password,Model model) {

        try {
            UserPojo user = iUserImpl.getUser(userName, password);
            if (user != null) {
                request.getSession().setAttribute(Global.USER_SESSION_KEY, user);
            }
            else
                return "/login";
            return "redirect:/main.htm";
        } catch (Exception e) {
            return "/login";
        }

    }

    @RequestMapping("/main.htm")
    public String main(Model model) {
        model.addAttribute("menu1s",iSysImpl.queryLev1Menu());
        return "/index";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute(Global.USER_SESSION_KEY);
        return "redirect:/";
    }


}
