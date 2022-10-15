package com.nbteam.killer.helper.base.controller

import cn.hutool.core.util.RandomUtil
import com.nbteam.killer.helper.base.trackTime
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4j
class TestController {

    @GetMapping("index")
    fun index(): List<String> = listOf(
        "Hello!",
        "Bonjour!",
        "Privet!",
    )

    @GetMapping("loop")
    fun loop(): String {

        trackTime {
            runBlocking {
                repeat(100000) {
                    GlobalScope.launch {
                        println("${Thread.currentThread().name}-run"+RandomUtil.getRandom().nextLong())
                        // Thread.sleep(2000)
                        // println(i+"wake")
                    }
                }
            }
        }
        return "loop"
    }

}

