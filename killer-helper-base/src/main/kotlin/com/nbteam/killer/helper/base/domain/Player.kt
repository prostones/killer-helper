package com.nbteam.killer.helper.base.domain

import com.nbteam.killer.helper.base.enums.RoleEnum
import lombok.Data

@Data
open class Player(
    /**
     * 角色
     */
    var role: RoleEnum?
) {
    /**
     * 座位号
     */
    var number: Int = 0

}