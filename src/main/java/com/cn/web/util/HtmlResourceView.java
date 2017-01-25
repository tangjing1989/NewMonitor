package com.cn.web.util;


import com.mysql.jdbc.StringUtils;
import org.springframework.web.servlet.View;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

import java.io.File;
import java.util.Locale;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/16
 * Time:下午5:18
 * 重写resolveViewName方法实现多视图的方法
 */
public class HtmlResourceView extends ThymeleafViewResolver {
    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {

        SpringResourceTemplateResolver servletContextTemplateResolver = (SpringResourceTemplateResolver) this.getWebApplicationContext().getBean("templateResolver");
        //servletContextTemplateResolver.initialize();
        String prefix = servletContextTemplateResolver.getPrefix().substring(1);
        String suffix = servletContextTemplateResolver.getSuffix();
        String path= this.getServletContext().getRealPath("/");
        path=path.substring(path.length()-1).equals("/")?path:path+"/";
        prefix=prefix.substring(prefix.length()).equals("/")?prefix:prefix.substring(0,prefix.length()-1);
        File   file   = new File(path + prefix + viewName + suffix);
        if (!file.exists()) {
            return null;
        }
        return super.resolveViewName(viewName, locale);
    }
}
