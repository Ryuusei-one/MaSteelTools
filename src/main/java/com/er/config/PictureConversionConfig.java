package com.er.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: Ryuusei
 * @E-mail: 3264958746@qq.com's:3264958746@qq.com
 * @Version: 1.0.0
 * @CreateDate: 2023/3/17 9:23
 */
@Configuration
public class PictureConversionConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * 资源映射路径
         * addResourceHandler：访问映射路径
         * addResourceLocations：资源绝对路径
         */
        registry.addResourceHandler("/doctor/**")
                .addResourceLocations("file:///F:/VSCode-WSP/vue-cli-mst/public/0313/");
    }
}
