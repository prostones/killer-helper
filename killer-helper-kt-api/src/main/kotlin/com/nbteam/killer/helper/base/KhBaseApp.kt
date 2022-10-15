package com.nbteam.killer.helper.base

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.concurrent.Executors
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

@SpringBootApplication
class KhBaseApp

fun main(args: Array<String>) {
    runApplication<KhBaseApp>(*args)

    trackTime { executorTest() } // 1264
    //trackTime { ktLaunchTest() } // 926
    //trackTime { threadTest() } // 6570
}


fun executorTest() = Executors.newCachedThreadPool().apply {
    repeat(10000) {
        execute {
            println("${Thread.currentThread().name}")
            //Thread.sleep(666)
        }
    }
}

fun ktLaunchTest() = runBlocking {
    repeat(10000) {
        launch {
            println("${Thread.currentThread().name}")
            //delay(666)
        }
    }
}

fun threadTest() = repeat(10000) {
    thread {
        println("${Thread.currentThread().name}")
        //Thread.sleep(666)
    }
}

fun trackTime(method: () -> Unit) = println("耗时->"+measureTimeMillis(method))

