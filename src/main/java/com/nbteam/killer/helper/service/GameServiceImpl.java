package com.nbteam.killer.helper.service;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.nbteam.killer.helper.domain.Game;
import com.nbteam.killer.helper.repository.GameBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Autowired
    GameBookRepository gameBookRepository;

    @Override
    public Game create(Integer playerTotal) throws Exception {

        Game game = BeanUtil.copyProperties(gameBookRepository.getRandom(playerTotal), Game.class);
        String code = game.getCode();
        redisTemplate.opsForValue().set(code, JSONUtil.toJsonStr(game));
        return game;

    }

    @Override
    public Game coming(String code) throws Exception {
        String json = redisTemplate.opsForValue().get(code);
        if (StrUtil.isBlankOrUndefined(json)) {
            throw new Exception("错误：无法找到房间");
        }

        Game game = JSONUtil.toBean(json, Game.class);
        return game;
    }

    @Override
    public void coming(String code, Integer number) {

    }
}
