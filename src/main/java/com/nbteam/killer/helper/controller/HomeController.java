package com.nbteam.killer.helper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        return "home/index";
    }

    @RequestMapping("/admin/index")
    public String adminIndex() {
        return "home/admin/index";
    }

    @RequestMapping("/player/index")
    public String playerIndex() {
        return "home/player/index";
    }
}
