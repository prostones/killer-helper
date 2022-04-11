package com.nbteam.killer.helper.controller;


import com.nbteam.killer.helper.repository.GameBookRepository;
import com.nbteam.killer.helper.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game/book")
@Api(tags = "板子相关")
public class GameBookController {

    @Autowired
    GameBookRepository gameBookRepository;

    @GetMapping("/list")
    @ApiOperation("板子字典")
    public Result<?> list() {
        return Result.ok(gameBookRepository.list());
    }
}
