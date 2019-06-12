package com.milo.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletContext;


/**
 * @author: milogenius
 * @create: 2019/4/8 17:02
 * @description:系统配置类
 **/
@Configuration
public class SystemConfiguration implements WebMvcConfigurer {

    @Autowired
    private ServletContext servletContext;

    /**
     * 静态资源地址
     */
    @Value("${web.staticUrl}")
    String webStaticUrl;

	/**
     * 附件上传地址
     */
    @Value("${web.uploadFileUrl}")
    String uploadFileUrl;

    /**
     * 全局地址
     */
    @Value("${web.globalUrl}")
    String globalUrl;



    /**
     * 注入从yml文件获取的配置信息到servletContext 提供给thymeleaf的页面使用
     * html页面中通过：${application.webStaticUrl}获取
     */
    @Bean
    public void setServletContext(){
        servletContext.setAttribute("webStaticUrl",webStaticUrl);
        servletContext.setAttribute("uploadFileUrl",uploadFileUrl);
        servletContext.setAttribute("globalUrl",globalUrl);
    }

}
