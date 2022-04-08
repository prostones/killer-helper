package com.nbteam.killer.helper.service;

import com.nbteam.killer.helper.domain.Game;

public interface GameService {

    /**
     * 上帝创建房间
     *
     * @param playerTotal
     * @return
     * @throws Exception
     */
    Game create(Integer playerTotal) throws Exception;

    /**
     * 上帝模式加入
     *
     * @param code
     */
    Game coming(String code) throws Exception;

    /**
     * 玩家模式加入
     *
     * @param code
     * @param number
     */
    Game coming(String code, Integer number) throws Exception;
}
