package com.nbteam.killer.helper.repository;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.RandomUtil;
import com.nbteam.killer.helper.base.enums.RoleEnum;
import com.nbteam.killer.helper.domain.GameBook;
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

        gameBooks.add(new GameBook("预|女|猎|魔|3狼|1狼王|4民",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.BAI_LANG_WANG,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.MO_SHU_SHI));

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

        gameBooks.add(new GameBook("女|猎|守|纯|3狼|1狼巫|4民",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.LANG_WU,
                RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.SHOU_WEI, RoleEnum.CHUN_BAI_ZHI_NV));

        gameBooks.add(new GameBook("预|女|潜|禁|4狼|4民",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.QIAN_XING_ZHE, RoleEnum.JIN_YAN_ZHANG_LAO));

        gameBooks.add(new GameBook("预|女|侍女|伯爵|摄|3狼|4民",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.SHE_MENG_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.SHI_NV, RoleEnum.BO_JUE));

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

        // 15人
        gameBooks.add(new GameBook("预|女|猎|白|魔|4狼|1狼王|5民",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.BAI_LANG_WANG,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.BAI_CHI, RoleEnum.MO_SHU_SHI));

        gameBooks.add(new GameBook("纯|女|守|猎|白|4狼|1狼巫|5民",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.LANG_WU,
                RoleEnum.CHUN_BAI_ZHI_NV, RoleEnum.NV_WU, RoleEnum.SHOU_WEI, RoleEnum.LIE_REN, RoleEnum.BAI_CHI
        ));

        gameBooks.add(new GameBook("预|女|猎|白|骑|4狼|1狼美人|5民",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.LANG_MEI_REN,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.BAI_CHI, RoleEnum.QI_SHI
        ));

        gameBooks.add(new GameBook("预|女|猎|白|摄梦人|4狼|恶灵骑士|5民",
                RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN, RoleEnum.LANG_REN,
                RoleEnum.E_LING_QI_SHI,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU, RoleEnum.LIE_REN, RoleEnum.BAI_CHI, RoleEnum.SHE_MENG_REN
        ));

        // 动物梦境
        // 10人
        gameBooks.add(new GameBook("2狼|美|4羊|豚|狐|熊",
                RoleEnum.LANG, RoleEnum.LANG,
                RoleEnum.MEI, RoleEnum.HE_TUN, RoleEnum.ZI_HU, RoleEnum.XIONG,
                RoleEnum.YANG_TUO, RoleEnum.YANG_TUO, RoleEnum.YANG_TUO, RoleEnum.YANG_TUO));

        // 12人
        gameBooks.add(new GameBook("3狼|美|4羊|白|豚|狐|熊",
                RoleEnum.LANG, RoleEnum.LANG, RoleEnum.LANG,
                RoleEnum.MEI, RoleEnum.BAI_MAO, RoleEnum.HE_TUN, RoleEnum.ZI_HU, RoleEnum.XIONG,
                RoleEnum.YANG_TUO, RoleEnum.YANG_TUO, RoleEnum.YANG_TUO, RoleEnum.YANG_TUO));

        // 休闲
        // 10人
        gameBooks.add(new GameBook("预|女|3猎|厚狼|2民|2狼狼",
                RoleEnum.PING_MING, RoleEnum.PING_MING,
                RoleEnum.LANG_LANG, RoleEnum.LANG_LANG,
                RoleEnum.HOU_LANG,
                RoleEnum.YU_YAN_JIA, RoleEnum.NV_WU,
                RoleEnum.LIE_REN, RoleEnum.LIE_REN, RoleEnum.LIE_REN));

        // 12人
        gameBooks.add(new GameBook("女|预|猎|白|摄|乌|丘|暗|噩|蚀时狼妃|狼巫|狼王",
                RoleEnum.NV_WU, RoleEnum.YU_YAN_JIA, RoleEnum.LIE_REN, RoleEnum.BAI_CHI,
                RoleEnum.SHE_MENG_REN, RoleEnum.WU_YA, RoleEnum.QIU_BI_TE,
                RoleEnum.AN_LIAN_ZHE, RoleEnum.E_MENG_ZHI_YING, RoleEnum.ZHU_SHI_LANG_FEI, RoleEnum.LANG_WU, RoleEnum.BAI_LANG_WANG
        ));

    }

    /**
     * 黑死病模式
     */
    GameBook BD_BOOK = new GameBook("黑死病模式",
            RoleEnum.YU_YAN_JIA,
            RoleEnum.NV_WU, RoleEnum.PING_MING, RoleEnum.PING_MING,
            RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
            RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
            RoleEnum.PING_MING, RoleEnum.PING_MING);

    GameBook BD_BOOK9 = new GameBook("黑死病9模式",
            RoleEnum.YU_YAN_JIA,
            RoleEnum.NV_WU, RoleEnum.PING_MING, RoleEnum.PING_MING,
            RoleEnum.PING_MING, RoleEnum.PING_MING, RoleEnum.PING_MING,
            RoleEnum.PING_MING, RoleEnum.PING_MING);

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
        return this.getById(id, null);
    }

    @Override
    public GameBook getById(String id, Boolean isBdModal) throws Exception {

        GameBook realBook = gameBooks.stream().filter(book -> book.getId().equals(id)).findAny().orElseThrow(() -> new Exception(String.format("错误：无法通过id[%s]找到板子", id)));

        if (BooleanUtil.isTrue(isBdModal) && realBook.getPlayers().size() == 9) {
            // 偷换玩家，如果模式多，可以再代理中实现
            GameBook bdBook = this.BD_BOOK9;
            bdBook.setTitle(realBook.getTitle());
            return bdBook;
        }

        if (BooleanUtil.isTrue(isBdModal) && realBook.getPlayers().size() == 12) {
            // 偷换玩家，如果模式多，可以再代理中实现
            GameBook bdBook = this.BD_BOOK;
            bdBook.setTitle(realBook.getTitle());
            return bdBook;
        }

        return realBook;
    }

    @Override
    public List<GameBook> list() {
        gameBooks.stream().forEach(book -> book.getPlayers().forEach(p -> p.setNumber(null)));
        return gameBooks;
    }
}
