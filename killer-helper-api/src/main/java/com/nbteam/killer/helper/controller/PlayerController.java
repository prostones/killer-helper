package com.nbteam.killer.helper.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.nbteam.killer.helper.domain.Game;
import com.nbteam.killer.helper.enums.RoleEnum;
import com.nbteam.killer.helper.service.GameService;
import com.nbteam.killer.helper.vo.GameVO;
import com.nbteam.killer.helper.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/player")
@Api(tags = "玩家相关")
public class PlayerController {

    @Autowired
    GameService gameService;

    @PostMapping("/coming/{code}/{number}")
    @ApiOperation("进入房间")
    public Result<?> coming(@PathVariable("code") String code, @PathVariable("number") Integer number) throws Exception {
        Game game = gameService.coming(code, number);
        Game gameCopy = BeanUtil.copyProperties(game, Game.class);
        game.setPlayers(CollUtil.toList(
                game.getPlayers().stream().filter(p -> p.getNumber().equals(number)).findAny().orElseThrow(() -> new Exception("错误：当前座位号不存在于本房间"))
        ));

        GameVO vo = BeanUtil.copyProperties(game, GameVO.class);
        // 如果是小狼，则返回队友
        if (RoleEnum.LANG_REN.equals(game.getPlayers().get(0).getRole())) {
            vo.setTeam(gameCopy.getPlayers().stream().filter(p -> RoleEnum.LANG_REN.equals(p.getRole())).collect(Collectors.toList()));
        }

        return Result.ok(vo);
    }

}
