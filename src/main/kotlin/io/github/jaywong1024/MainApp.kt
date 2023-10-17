package io.github.jaywong1024

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
open class MainApp {

    @RequestMapping("/")
    fun home() = "Fuck you! Java!"

}

fun main(args: Array<String>) {
    runApplication<MainApp>(*args)
}



