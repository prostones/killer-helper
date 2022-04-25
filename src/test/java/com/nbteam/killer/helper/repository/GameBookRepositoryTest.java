package com.nbteam.killer.helper.repository;

import com.nbteam.killer.helper.KillerHelperApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = KillerHelperApplication.class)
@RunWith(SpringRunner.class)
class GameBookRepositoryTest {

    @Autowired
    GameBookRepository gameBookRepository;

    @Test
    void getById() {
    }
}