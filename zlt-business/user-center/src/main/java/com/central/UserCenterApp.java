package com.central;

import com.central.common.annotation.EnableLoginArgResolver;
import com.central.search.annotation.EnableSearchClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 作者 owen E-mail: 624191343@qq.com
 */
@EnableLoginArgResolver
@EnableDiscoveryClient
@EnableSearchClient
@EnableTransactionManagement
@SpringBootApplication
public class UserCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterApp.class, args);
    }
}
