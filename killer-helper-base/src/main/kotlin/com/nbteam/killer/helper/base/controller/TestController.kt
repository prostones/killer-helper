package com.nbteam.killer.helper.base.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping
    fun index(): List<String> = listOf(
        "Hello!",
        "Bonjour!",
        "Privet!",
    )
}