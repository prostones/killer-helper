package com.nbteam.killer.helper.domain;

import cn.hutool.core.util.RandomUtil;
import com.nbteam.killer.helper.enums.RoleEnum;
import lombok.Data;

import java.util.*;

@Data
public class GameBook {

    public GameBook(RoleEnum... rs) {
        Arrays.stream(rs).forEach(r -> players.add(new Player(r)));

        Set<Integer> numbers = new HashSet<>();
        for (Player p : players) {
            Integer number = RandomUtil.randomInt(1, rs.length + 1);
            while (!numbers.contains(number)) {
                p.setNumber(number);
                numbers.add(number);
            }
        }
    }

    public Integer getTotal() {
        return players.size();
    }

    List<Player> players = new ArrayList<>();
}
