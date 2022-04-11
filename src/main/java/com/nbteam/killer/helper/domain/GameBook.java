package com.nbteam.killer.helper.domain;

import com.nbteam.killer.helper.enums.RoleEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    List<Player> players = new ArrayList<>();

    public Integer getTotal() {
        return players.size();
    }

}
