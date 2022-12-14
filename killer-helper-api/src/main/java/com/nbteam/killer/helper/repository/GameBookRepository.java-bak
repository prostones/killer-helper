package com.nbteam.killer.helper.repository;

import com.nbteam.killer.helper.domain.GameBook;

import java.util.List;

public interface GameBookRepository {

    /**
     * 通过玩家数量随机取本
     *
     * @param playerTotal
     * @return
     * @throws Exception
     */
    GameBook getRandom(Integer playerTotal) throws Exception;

    /**
     * 通过板子id创建板子
     *
     * @param id
     * @return
     */
    GameBook getById(String id) throws Exception;

    /**
     * 通过板子id创建板子
     *
     * @param id
     * @param isBdModal
     * @return
     */
    GameBook getById(String id, Boolean isBdModal) throws Exception;

    /**
     * 获取板子集合
     *
     * @return
     */
    List<GameBook> list();
}
