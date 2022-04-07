package com.nbteam.killer.helper.repository;

import com.nbteam.killer.helper.domain.Game;

public interface GameBookRepository {

    Game getRandom(Integer playerTotal);
}
