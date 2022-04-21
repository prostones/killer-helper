package com.nbteam.killer.helper.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum RoleEnum {

    PING_MING("平民", "分析其他玩家发言，认真地投出每一票，直到驱逐所有狼人。", true, ""),
    LANG_REN("狼人", "每天夜里可以杀死一个人。", false, ""),
    YU_YAN_JIA("预言家", "每天晚上可以查验一名玩家的身份是好人还是狼人。", true, ""),
    LIE_REN("猎人", "当且仅当猎人被狼人杀害或被投票放逐时，猎人可以亮出自己的身份牌并指定枪杀一名玩家，被女巫毒杀则无法发动技能。", true, ""),
    NV_WU("女巫", "女巫拥有两瓶药，解药可以救活一名当晚被狼人杀害的玩家，毒药可以毒杀一名玩家，女巫每天晚上最多使用一瓶药，女巫不可自救。", true, ""),
    SHOU_WEI("守卫", "", true, ""),
    BAI_CHI("白痴", "", true, ""),
    QIU_BI_TE("丘比特", "", true, ""),
    LAO_LIU_MANG("老流氓", "", true, ""),
    ZHA_DAN_REN("炸弹人", "", true, ""),
    YE_HAI_ZI("野孩子", "", true, ""),
    ZHOU_HU("咒狐", "", false, ""),
    HEI_LANG_WANG("黑狼王", "", false, ""),
    QI_SHI("骑士", "", true, ""),
    LANG_MEI_REN("狼美人", "", false, ""),
    SHI_XIANG_GUI("石像鬼", "", false, ""),
    DAO_ZEI("盗贼", "", false, ""),
    QI_JI_SHANG_REN("奇迹商人", "", true, ""),
    MENG_YAN("梦魇", "", false, ""),
    BAI_LANG_WANG("白狼王", "", false, ""),
    MO_SHU_SHI("魔术师", "", false, ""),
    CHUN_BAI_ZHI_NV("纯白之女","",true,""),
    LANG_WU("狼巫", "", true, ""),
    QIAN_XING_ZHE("潜行者","",true,""),
    JIN_YAN_ZHANG_LAO("禁言长老","",true,""),

    LANG("狼", "", true, ""),
    MEI("美", "", true, ""),
    YANG_TUO("羊驼", "", true, ""),
    BAI_MAO("白猫", "", true, ""),
    HE_TUN("河豚", "", true, ""),
    ZI_HU("子狐", "", true, ""),
    XIONG("熊", "", true, "");


    /**
     * 名称
     */
    String code;

    /**
     * 描述
     */
    String description;

    /**
     * 是否好人
     */
    boolean isGoodMan;

    /**
     * 角色卡片照片地址
     */
    String picUrl;
}
