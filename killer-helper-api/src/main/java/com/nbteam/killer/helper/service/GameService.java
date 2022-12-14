package com.nbteam.killer.helper.service;

import com.nbteam.killer.helper.base.domain.Game;

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
     * 通过板子id创建房间
     *
     * @param id
     * @return
     */
    Game create(String id) throws Exception;

    /**
     * 通过板子id创建房间
     *
     * @param id
     * @param isBdModal
     * @return
     */
    Game create(String id, Boolean isBdModal) throws Exception;

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
