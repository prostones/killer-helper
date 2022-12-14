package com.nbteam.killer.helper.base.domain

import cn.hutool.core.collection.CollUtil
import cn.hutool.core.util.RandomUtil
import cn.hutool.core.util.StrUtil
import lombok.Data
import java.util.stream.Collectors

@Data
open class Game : GameBook() {
    /**
     * 房间号
     */
    private var code: String? = null

    /**
     * 随机生成4位number作为房间号
     *
     * @return
     */
    fun getCode(): String? {
        if (StrUtil.isBlankOrUndefined(code)) {
            code = RandomUtil.randomInt(1000, 9999).toString()
        }
        return code
    }

    /**
     * 随机分发座位号
     */
    fun randomNumber() {
        val numbers: MutableSet<Int> = HashSet()
        for (p in players) {
            while (true) {
                val number = RandomUtil.createSecureRandom(RandomUtil.randomBytes(10))
                    .nextInt(players.size + 1) // .randomInt(1, rs.length + 1);
                if (!numbers.contains(number) && number > 0) {
                    p.number = number;
                    numbers.add(number)
                    break
                }
            }
        }
    }

    override var players: MutableList<Player>
        get() = if (CollUtil.isEmpty(super.players)) {
            ArrayList();
        } else super.players.stream().sorted(Comparator.comparingInt { obj: Player -> obj.number })
            .collect(Collectors.toList())
        set(players) {
            super.players = players
        }
}