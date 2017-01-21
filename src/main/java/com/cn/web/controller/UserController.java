package com.cn.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.cn.web.pojo.UserPojo;
import com.cn.web.service.IUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    private IUserImpl iUser;

    private static final String url="user/";

    @RequestMapping("/list.htm")
    public String toUserList(Model model) throws Exception
    {

        List<UserPojo> userPojoList= iUser.queryUserList();
        model.addAttribute("users",userPojoList);
        String str=JSONObject.toJSONString(userPojoList);
        System.out.println(str);
        return url+"list";
    }

    @RequestMapping("/list.json")
    public void queryUserListByAjax(HttpServletResponse response) throws Exception
    {

        Map<String, Object> maps = new HashMap<>();
        List<UserPojo> results= iUser.queryUserList();
        int totalCount = iUser.queryUserListCount();
        maps.put("recordsTotal", totalCount);
        maps.put("recordsFiltered", totalCount);
        maps.put("aaData", results);

        String jsonResult = JSONObject.toJSONString(maps);
        response.setCharacterEncoding("utf-8");
       // response.getWriter().write("{\"success\":true, \"data\":" + jsonResult+ "}");
        response.getWriter().write("{'draw': 4,'recordsTotal': 57,'recordsFiltered': 57,'data': [['Sakura','Yamamoto','Support Engineer','Tokyo','2009/08/19',139575]}");
        response.getWriter().flush();

    }

    public String doList(HttpServletRequest request,String userName){

        String callNum=request.getParameter("userName");
        String accNum=request.getParameter("phone");

//        if(StringUtils.isBlank(userName)&&StringUtils.isBlank(phone)){
//            request.setAttribute("message", "查询参数不能全空");
//            return "list";
//        }
        //获得分页参数
        String currentPage=request.getParameter("currentPage");
        String pageSize=request.getParameter("pageSize");

        HashMap<String,String> param=new HashMap<String,String>();
        param.put("userName", userName);
        param.put("currentPage", currentPage);
        param.put("pageSize", pageSize);

//        IPageList<UserPojo> pList =service.selectList(param);
//        IPager              pager =new MiniPager(pList);
//        pager.save2Request(request, "list");

        return "list";
    }

}
