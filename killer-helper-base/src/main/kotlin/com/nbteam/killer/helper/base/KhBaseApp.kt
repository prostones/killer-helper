package com.nbteam.killer.helper.base

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KhBaseApp

fun main(args: Array<String>) {
    runApplication<KhBaseApp>(*args)
}
