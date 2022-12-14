package com.nbteam.killer.helper.base.domain

import cn.hutool.core.util.StrUtil
import com.nbteam.killer.helper.base.enums.RoleEnum
import lombok.Data
import java.io.Serializable
import java.util.*

@Data
open class GameBook : Serializable {
    private var id: String? = null
    var title: String? = null

    constructor(vararg rs: RoleEnum) {
        Arrays.stream(rs).forEach { r: RoleEnum -> players.add(Player(r)) }
    }

    constructor(title: String?, vararg rs: RoleEnum) {
        this.title = title
        Arrays.stream(rs).forEach { r: RoleEnum -> players.add(Player(r)) }
    }

    fun getId(): String? {
        if (StrUtil.isBlankOrUndefined(id)) {
            id = UUID.randomUUID().toString().replace("-", "").lowercase(Locale.getDefault())
        }
        return id
    }

    open var players: MutableList<Player> = ArrayList<Player>()
    val total: Int
        get() = players.size
}