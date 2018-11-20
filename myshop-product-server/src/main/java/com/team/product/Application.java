package com.team.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: YouQi
 * @Date: 2018/11/20 19:06
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan("com.team.product.mapper")
public class Application {
    public static void  main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
