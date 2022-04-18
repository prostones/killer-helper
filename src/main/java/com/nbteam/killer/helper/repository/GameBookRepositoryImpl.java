package com.nbteam.killer.helper.repository;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.RandomUtil;
import com.nbteam.killer.helper.domain.GameBook;
import com.nbteam.killer.helper.enums.RoleEnum;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class GameBookRepositoryImpl implements GameBookRepository {

    static List<GameBook> gameBooks = new ArrayList<>();

    static {

        // 9人
        gameBooks.add(new GameBook("预|女|猎|3民|3狼",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN));

        // 10人
        gameBooks.add(new GameBook("预|女|猎|白|3民|3狼",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.BAI_CHI));

        // 11人
        gameBooks.add(new GameBook("预|女|猎|4民|4狼",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN));

        // 12人
        gameBooks.add(new GameBook("预|女|猎|守|4民|4狼",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.SHOU_WEI));

        gameBooks.add(new GameBook("预|女|猎|守|4民|3狼|白狼王",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.BAI_LANG_WANG,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.SHOU_WEI));

        gameBooks.add(new GameBook("预|女|猎|白|4民|4狼",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.BAI_CHI));

        gameBooks.add(new GameBook("预|女|猎|4民|4狼|丘比特",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.QIU_BI_TE));

        gameBooks.add(new GameBook("预|女|猎|白|3民|3狼|咒狐|野孩子",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.BAI_CHI,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.YE_HAI_ZI,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.ZHOU_HU));

        gameBooks.add(new GameBook("预|女|猎|守|4民|3狼|梦魇",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.SHOU_WEI, RoleEnum.MENG_YAN
        ));

        // 13人
        gameBooks.add(new GameBook("预|女|猎|守|4民|4狼|咒狐",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.SHOU_WEI, RoleEnum.ZHOU_HU));

        gameBooks.add(new GameBook("预|女|猎|守|4民|4狼|丘比特",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.SHOU_WEI, RoleEnum.QIU_BI_TE));

        gameBooks.add(new GameBook("预|女|猎|白|4民|4狼|老流氓",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.BAI_CHI, RoleEnum.LAO_LIU_MANG));

        // 14人
        gameBooks.add(new GameBook("预|女|猎|白|4民|4狼|老流氓|炸弹人",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.BAI_CHI, RoleEnum.LAO_LIU_MANG, RoleEnum.ZHA_DAN_REN));

    }

    @Override
    public GameBook getRandom(Integer playerTotal) throws Exception {

        List<GameBook> list = gameBooks.parallelStream().filter(book -> book.getTotal().equals(playerTotal)).collect(Collectors.toList());
        if (CollUtil.isEmpty(list)) {
            throw new Exception("错误：不支持的玩家数量");
        }

        return list.get(RandomUtil.randomInt(0, list.size()));
    }

    @Override
    public GameBook getById(String id) throws Exception {
        return gameBooks.stream().filter(book -> book.getId().equals(id)).findAny().orElseThrow(() -> new Exception(String.format("错误：无法通过id[%s]找到板子", id)));
    }

    @Override
    public List<GameBook> list() {
        gameBooks.stream().forEach(book -> book.getPlayers().forEach(p -> p.setNumber(null)));
        return gameBooks;
    }
}
