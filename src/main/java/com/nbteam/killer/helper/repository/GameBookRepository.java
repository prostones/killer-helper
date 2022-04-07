package com.nbteam.killer.helper.repository;

import com.nbteam.killer.helper.domain.GameBook;

public interface GameBookRepository {

    /**
     * 通过玩家数量随机取本
     *
     * @param playerTotal
     * @return
     * @throws Exception
     */
    GameBook getRandom(Integer playerTotal) throws Exception;
}
