package com.nbteam.killer.helper.repository;

import com.nbteam.killer.helper.domain.Game;
import com.nbteam.killer.helper.domain.GameBook;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GameBookRepositoryImpl implements GameBookRepository {

    static List<GameBook> gameBooks = new ArrayList<>();

    static {
        gameBooks.add();
    }

    @Override
    public Game getRandom(Integer playerTotal) {
        return null;
    }
}
