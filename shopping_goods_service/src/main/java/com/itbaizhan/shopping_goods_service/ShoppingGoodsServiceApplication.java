package com.itbaizhan.shopping_goods_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//配置myBatis-plus 扫描接口
@MapperScan("com.itbaizhan.shopping_goods_service.mapper")
public class ShoppingGoodsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingGoodsServiceApplication.class, args);
    }

}
