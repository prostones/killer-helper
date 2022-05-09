package com.nbteam.killer.helper.vo;

import com.nbteam.killer.helper.domain.Game;
import com.nbteam.killer.helper.domain.Player;
import lombok.Data;

import java.util.List;

@Data
public class GameVO extends Game {

    /**
     * 队友
     */
    private List<Player> team;

}
