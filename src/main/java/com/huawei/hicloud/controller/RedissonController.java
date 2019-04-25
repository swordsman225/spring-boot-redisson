package com.huawei.hicloud.controller;

import com.alibaba.fastjson.JSON;
import com.huawei.hicloud.vo.ResultVO;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(value = "/v1.0/distLock")
public class RedissonController {

    private static final Logger logger = LoggerFactory.getLogger(RedissonController.class);

    @Autowired
    private RedissonClient redissonClient;

    @RequestMapping(value = "/lock", method = RequestMethod.POST)
    public ResultVO<Object> lock(String lockKey) {
        logger.info("Lock resource params: {}", lockKey);
        RLock lock = redissonClient.getLock(lockKey);
        lock.lock(10, TimeUnit.SECONDS);
        logger.info("Lock resource result: {}", JSON.toJSONString(lock));

        return ResultVO.success(null);
    }


    @RequestMapping(value = "/unlock", method = RequestMethod.POST)
    public ResultVO<Object> unlock(String lockKey) {
        logger.info("Unlock resource params: {}", lockKey);
        RLock lock = redissonClient.getLock(lockKey);
        lock.unlock();
        logger.info("Unlock resource result: {}", JSON.toJSONString(lock));

        return ResultVO.success(null);
    }


}
