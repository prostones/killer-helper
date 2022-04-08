package com.nbteam.killer.helper.controller;

import com.nbteam.killer.helper.domain.Game;
import com.nbteam.killer.helper.service.GameService;
import com.nbteam.killer.helper.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    GameService gameService;

    @GetMapping("index")
    public Result<?> index() {
        return Result.ok();
    }

    @PostMapping("/create/{playerTotal}")
    public Result<?> create(@PathVariable Integer playerTotal) throws Exception {
        Game game = gameService.create(playerTotal);
        return Result.ok(game);
    }

    @PostMapping("/coming/{code}")
    public Result<?> coming(@PathVariable("code") String code) throws Exception {
        Game game = gameService.coming(code);
        return Result.ok(game);
    }

}
