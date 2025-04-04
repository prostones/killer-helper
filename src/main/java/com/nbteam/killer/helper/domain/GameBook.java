package com.nbteam.killer.helper.domain;

import cn.hutool.core.util.StrUtil;
import com.nbteam.killer.helper.enums.RoleEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class GameBook implements Serializable {

    String id;

    String title;

    public GameBook(RoleEnum... rs) {
        Arrays.stream(rs).forEach(r -> players.add(new Player(r)));
    }

    public GameBook(String title, RoleEnum... rs) {
        this.title = title;
        Arrays.stream(rs).forEach(r -> players.add(new Player(r)));
    }

    public String getId() {

        if (StrUtil.isBlankOrUndefined(id)) {
            // id = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            id = String.valueOf(title.hashCode());
        }

        return id;
    }

    List<Player> players = new ArrayList<>();

    public Integer getTotal() {
        return players.size();
    }

}
