package com.profemzy.photoappapialbums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoappapialbumsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoappapialbumsApplication.class, args);
    }

}
