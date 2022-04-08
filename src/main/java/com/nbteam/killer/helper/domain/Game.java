package com.nbteam.killer.helper.domain;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import lombok.Data;

@Data
public class Game extends GameBook {

    /**
     * 房间号
     */
    String code;

    /**
     * 随机生成4位number作为房间号
     *
     * @return
     */
    public String getCode() {
        if (StrUtil.isBlankOrUndefined(code)) {
            code = String.valueOf(RandomUtil.randomInt(1000, 9999));
        }

        return code;
    }
}
