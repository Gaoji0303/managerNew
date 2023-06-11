package com.example.managernew.redis;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.xml.transform.Result;

/**
 * @author 白未
 * @site 3185579318
 * @company xxx公司
 * @create  2022-10-26 11:47
 */
public class Demo1 {
//    @RestController
//    @RequestMapping("redis")
//    public class RedisTestController {
//        @Autowired
//        RedisTemplate redisTemplate;
//
//        @GetMapping("getValue")
//        public Result getValue() {
//            redisTemplate.opsForValue().set("testKey", "testValue");
//            return Result.succ(redisTemplate.opsForValue().get("testKey"));
//        }
//    }

    public static void main(String[] args){
        Jedis jedis = new Jedis("120.78.85.146", 6379);
        jedis.auth("123456");
//        jedis.append("first","test");
        jedis.set("first","test2");
        System.out.println(jedis.get("first"));
    }



}