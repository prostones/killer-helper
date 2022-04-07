package com.nbteam.killer.helper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public void create() {

    }

    @Override
    public void coming() {

    }
}
