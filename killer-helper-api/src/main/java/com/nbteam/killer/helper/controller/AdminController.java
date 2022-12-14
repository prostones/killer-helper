package com.nbteam.killer.helper.controller;

import com.nbteam.killer.helper.base.domain.Game;
import com.nbteam.killer.helper.service.GameService;
import com.nbteam.killer.helper.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@Api(tags = "上帝相关")
@Slf4j
public class AdminController {

    @Value("${app.version}")
    private String version;

    @Value("${app.build.time}")
    private String buildTime;

    @Autowired
    private GameService gameService;

    @GetMapping("index")
    public Result<?> index() {
        return Result.ok();
    }

    @GetMapping("/version")
    @ApiOperation("获取版本号")
    public Result<?> version() {
        return Result.ok(buildTime);
    }

    @PostMapping("/create/{total}")
    @ApiOperation("创建房间，使用玩家数量，随机获取对应人数的板子")
    public Result<?> create(@PathVariable Integer total) throws Exception {

        log.info("收到创建房间请求");

        Game game = gameService.create(total);
        return Result.ok(game);
    }

    @PostMapping("/create/by/{gameBookId}")
    @ApiOperation("创建房间,使用板子id")
    public Result<?> create(@PathVariable("gameBookId") String gameBookId,
                            @RequestParam(value = "isBdModal", required = false, defaultValue = "false") Boolean isBdModal) throws Exception {
        Game game = gameService.create(gameBookId, isBdModal);
        return Result.ok(game);
    }

    @PostMapping("/coming/{code}")
    @ApiOperation("上帝返回房间")
    public Result<?> coming(@PathVariable("code") String code) throws Exception {
        Game game = gameService.coming(code);
        return Result.ok(game);
    }

}
