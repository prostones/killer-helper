package com.nbteam.killer.helper.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleEnum {

    PING_MING("平民","一个好人",true),
    LANG_REN("狼人","一个狼人",false);

    String code;

    String description;

    boolean isGoodMan;
}
