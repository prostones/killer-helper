package com.nbteam.killer.helper.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum RoleEnum {

    PING_MING("平民", "分析其他玩家发言，认真地投出每一票，直到驱逐所有狼人。", true),
    LANG_REN("狼人", "每天夜里可以杀死一个人。", false),
    YU_YAN_JIA("预言家", "每天晚上可以查验一名玩家的身份是好人还是狼人。", true),
    LIE_REN("猎人", "当且仅当猎人被狼人杀害或被投票放逐时，猎人可以亮出自己的身份牌并指定枪杀一名玩家，被女巫毒杀则无法发动技能。", true),
    NV_WU("女巫", "女巫拥有两瓶药，解药可以救活一名当晚被狼人杀害的玩家，毒药可以毒杀一名玩家，女巫每天晚上最多使用一瓶药，女巫不可自救。", true),
    SHOU_WEI("守卫","",true);

    String code;

    String description;

    boolean isGoodMan;
}
