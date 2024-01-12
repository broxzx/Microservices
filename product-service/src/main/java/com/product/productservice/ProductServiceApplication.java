package com.product.productservice;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProductServiceApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.OFF)
                .sources(ProductServiceApplication.class)
                .run(args);
    }

}
