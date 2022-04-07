package com.nbteam.killer.helper.domain;

import com.nbteam.killer.helper.enums.RoleEnum;
import lombok.Data;

@Data
public class Player {

    public Player(RoleEnum role) {
        this.role = role;
    }

    RoleEnum role;

    Integer number;

}
