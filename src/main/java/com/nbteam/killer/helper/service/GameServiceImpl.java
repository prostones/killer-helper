package com.nbteam.killer.helper.service;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.nbteam.killer.helper.domain.Game;
import com.nbteam.killer.helper.domain.Player;
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

    /**
     * code
     */
    String game_key = "game:%s";

    /**
     * code+playerNumber
     */
    String player_key = "player:%s:%s";

    @Override
    public Game create(Integer playerTotal) throws Exception {

        Game game = BeanUtil.copyProperties(gameBookRepository.getRandom(playerTotal), Game.class);
        String code = game.getCode();
        game.randomNumber();
        redisTemplate.opsForValue().set(String.format(game_key, code), JSONUtil.toJsonStr(game));
        return game;

    }

    @Override
    public Game create(String id) throws Exception {
        Game game = BeanUtil.copyProperties(gameBookRepository.getById(id), Game.class);
        String code = game.getCode();
        game.randomNumber();
        redisTemplate.opsForValue().set(String.format(game_key, code), JSONUtil.toJsonStr(game));
        return game;
    }

    @Override
    public synchronized Game coming(String code) throws Exception {
        String json = redisTemplate.opsForValue().get(String.format(game_key, code));
        if (StrUtil.isBlankOrUndefined(json)) {
            throw new Exception("错误：无法找到房间");
        }

        Game game = JSONUtil.toBean(json, Game.class);
        return game;
    }

    @Override
    public synchronized Game coming(String code, Integer number) throws Exception {
        String json = redisTemplate.opsForValue().get(String.format(game_key, code));
        if (StrUtil.isBlankOrUndefined(json)) {
            throw new Exception("错误：无法找到房间");
        }
        Game game = JSONUtil.toBean(json, Game.class);

        String playerJson = redisTemplate.opsForValue().get(String.format(player_key, code, number));
        if (!StrUtil.isBlankOrUndefined(playerJson)) {
            throw new Exception("错误：当前编号玩家已入场");
        }

        Player player = game.getPlayers().stream().filter(p -> p.getNumber() == number).findAny().orElseThrow(() -> new Exception("错误：当前房间无此编号玩家"));
        redisTemplate.opsForValue().set(String.format(player_key, code, number), JSONUtil.toJsonStr(player));

        return game;
    }
}
