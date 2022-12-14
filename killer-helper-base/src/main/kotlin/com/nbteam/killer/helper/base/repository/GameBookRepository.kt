package com.nbteam.killer.helper.repository

import com.nbteam.killer.helper.base.domain.GameBook

interface GameBookRepository {
    /**
     * 通过玩家数量随机取本
     *
     * @param playerTotal
     * @return
     * @throws Exception
     */
    @Throws(Exception::class)
    fun getRandom(playerTotal: Int?): GameBook?

    /**
     * 通过板子id创建板子
     *
     * @param id
     * @return
     */
    @Throws(Exception::class)
    fun getById(id: String?): GameBook?

    /**
     * 通过板子id创建板子
     *
     * @param id
     * @param isBdModal
     * @return
     */
    @Throws(Exception::class)
    fun getById(id: String?, isBdModal: Boolean?): GameBook?

    /**
     * 获取板子集合
     *
     * @return
     */
    fun list(): List<GameBook?>?
}