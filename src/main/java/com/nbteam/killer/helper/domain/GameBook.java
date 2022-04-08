package com.nbteam.killer.helper.domain;

import com.nbteam.killer.helper.enums.RoleEnum;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class GameBook {

    String title;

    public GameBook(String title,RoleEnum... rs) {
        this.title = title;
        Arrays.stream(rs).forEach(r -> players.add(new Player(r)));
    }

    List<Player> players = new ArrayList<>();

    public Integer getTotal() {
        return players.size();
    }

}
