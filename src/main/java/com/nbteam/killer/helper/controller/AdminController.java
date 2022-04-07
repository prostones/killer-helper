package com.nbteam.killer.helper.controller;

import com.nbteam.killer.helper.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("index")
    public Result<?> index() {
        return Result.ok();
    }

    // todo 开局 输入人数，板子
    // todo 获取板子

}
