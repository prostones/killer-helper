package com.nbteam.killer.helper.domain;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    /**
     * 随机分发座位号
     */
    public void randomNumber() {
        Set<Integer> numbers = new HashSet<>();
        for (Player p : players) {
            while (true) {
                Integer number = RandomUtil.createSecureRandom(RandomUtil.randomBytes(10)).nextInt(players.size() + 1);// .randomInt(1, rs.length + 1);
                if (!numbers.contains(number) && number > 0) {
                    p.setNumber(number);
                    numbers.add(number);
                    break;
                }
            }
        }

    }

    public List<Player> getPlayers() {
        if (CollUtil.isEmpty(players)) {
            return players;
        }

        return players.stream().sorted(Comparator.comparingInt(Player::getNumber)).collect(Collectors.toList());
    }
}
