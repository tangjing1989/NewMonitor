package com.cn.web.util;

import com.cn.web.util.config.IConfigService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Describe:应用启动时候的初始化，和全局参数的内存化
 * User:tangjing
 * Date:17/1/25
 * Time:上午10:15
 */

public class SpringContextService {

    @Autowired
    IConfigService iConfigService;

    //应用服务器类型
    public static String SYS_SERVER_TYPE="";

    public void init() {

        //获取应用服务器类型
        this.SYS_SERVER_TYPE=iConfigService.getMiddleware();

    }
}
