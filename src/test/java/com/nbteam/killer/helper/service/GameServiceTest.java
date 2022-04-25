package com.nbteam.killer.helper.service;

import com.nbteam.killer.helper.KillerHelperApplication;
import com.nbteam.killer.helper.enums.RoleEnum;
import com.nbteam.killer.helper.repository.GameBookRepository;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = KillerHelperApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
class GameServiceTest {

    @Autowired
    private GameService gameService;

    @Autowired
    private GameBookRepository gameBookRepository;

    @Test
    void create() throws Exception {
        var list = gameBookRepository.list();
        var book = list.get(0);

        log.info("注意：使用板子" + book.getTitle() + "进行测试");

        int count = 0;
        int total = 1000;

        for (int i = 0; i < 1000; i++) {
            if (gameService.create(book.getId()).getPlayers().stream().anyMatch(p -> p.getNumber().equals(1) && p.getRole().equals(RoleEnum.YU_YAN_JIA))) {
                count++;
            }
        }

        log.info("1号预言家概率=>" + (count / total));
    }
}