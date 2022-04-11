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

        gameBooks.add(new GameBook("预女猎-3民-3狼",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN));

        gameBooks.add(new GameBook("预女猎守-4民-4狼",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.SHOU_WEI));

    }

    @Override
    public GameBook getRandom(Integer playerTotal) throws Exception {
        return gameBooks.stream().filter(book -> book.getTotal().equals(playerTotal)).findAny().orElseThrow(() -> new Exception("错误：不支持的玩家数量"));
    }

    @Override
    public GameBook getById(String id) throws Exception {
        return gameBooks.stream().filter(book -> book.getId().equals(id)).findAny().orElseThrow(() -> new Exception(String.format("错误：无法通过id[%s]找到板子", id)));
    }

    @Override
    public List<GameBook> list() {
        return gameBooks;
    }
}
