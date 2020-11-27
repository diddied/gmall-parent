package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author pbc
 * @Description:
 * @date 2020/11/27 18:13
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动配置
//@ComponentScan({"com.atguigu.gmall"})
public class ServiceProductApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceProductApplication.class, args);
    }

}