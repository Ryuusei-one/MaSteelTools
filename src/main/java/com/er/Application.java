package com.er;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: Ryuusei
 * @E-mail: 3264958746@QQ.com's:3264958746@qq.com
 * @Version: 1.0.0
 * @CreateDate: 2023/3/9 10:34
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
