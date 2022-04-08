package com.nbteam.killer.helper.controller;

import com.nbteam.killer.helper.domain.Game;
import com.nbteam.killer.helper.service.GameService;
import com.nbteam.killer.helper.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    GameService gameService;

    @PostMapping("/coming/{code}/{number}")
    public Result<?> coming(@PathVariable("code") String code, @PathVariable("number") Integer number) throws Exception {
        Game game = gameService.coming(code, number);
        return Result.ok(game);
    }

}
