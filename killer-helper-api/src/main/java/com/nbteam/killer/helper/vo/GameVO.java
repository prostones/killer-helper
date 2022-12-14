package com.nbteam.killer.helper.vo;

import com.nbteam.killer.helper.base.domain.Game;
import com.nbteam.killer.helper.base.domain.Player;
import lombok.Data;

import java.util.List;

@Data
public class GameVO extends Game {

    /**
     * 队友
     */
    private List<Player> team;

}
