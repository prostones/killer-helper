package com.nbteam.killer.helper.domain;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import lombok.Data;

@Data
public class Game extends GameBook {

    String code;

    public String getCode() {
        if (StrUtil.isBlankOrUndefined(code)) {
            code = String.valueOf(RandomUtil.randomInt(1000, 9999));
        }

        return code;
    }
}
