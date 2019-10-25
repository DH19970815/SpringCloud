package com.duhang.springcloud.dept.config;

import com.duhang.springcloud.entities.Dept;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

@Configuration
public class MycacheConfig {

    @Bean
    public RedisTemplate<Object, Dept> deptRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object, Dept> redisTemplate = new RedisTemplate<Object, Dept>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Dept> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Dept>(Dept.class);
        redisTemplate.setDefaultSerializer(jackson2JsonRedisSerializer);
        return redisTemplate;
    }

    @Bean
    public RedisCacheManager redisCacheManager (RedisTemplate deptRedisTemplate){

        return  null;
    }
}
