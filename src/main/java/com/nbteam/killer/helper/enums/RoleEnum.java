package com.nbteam.killer.helper.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleEnum {

    PING_MING("平民", "一个好人", true),
    LANG_REN("狼人", "一个狼人", false),
    YU_YAN_JIA("预言家", "", true),
    LIE_REN("猎人", "", true),
    NV_WU("女巫", "", true);


    String code;

    String description;

    boolean isGoodMan;
}
