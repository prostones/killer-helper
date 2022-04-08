package com.nbteam.killer.helper.repository;

import com.nbteam.killer.helper.domain.GameBook;
import com.nbteam.killer.helper.enums.RoleEnum;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GameBookRepositoryImpl implements GameBookRepository {

    static List<GameBook> gameBooks = new ArrayList<>();

    static {

        // 预女猎 3民 3狼
        gameBooks.add(new GameBook("预女猎3民3狼",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN));

    }

    @Override
    public GameBook getRandom(Integer playerTotal) throws Exception {
        return gameBooks.stream().filter(book -> book.getTotal().equals(playerTotal)).findAny().orElseThrow(() -> new Exception("错误：不支持的玩家数量"));
    }
}
