package com.huawei.hicloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedissonApplication {

    private static final Logger logger = LoggerFactory.getLogger(RedissonApplication.class);

    public static void main(String[] args) {
        logger.info("### Redisson application start ...");
        SpringApplication.run(RedissonApplication.class, args);
        logger.info("### Redisson application end ...");
    }

}
