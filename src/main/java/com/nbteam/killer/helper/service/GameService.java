package com.nbteam.killer.helper.service;

import com.nbteam.killer.helper.domain.Game;

public interface GameService {

    Game create(Integer playerTotal) throws Exception;

    /**
     * 上帝模式加入
     * @param code
     */
    Game coming(String code) throws Exception;

    /**
     * 玩家模式加入
     * @param code
     * @param number
     */
    void coming(String code,Integer number);
}
