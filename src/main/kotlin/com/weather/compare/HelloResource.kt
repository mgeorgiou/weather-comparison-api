package com.weather.compare

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloResource {
    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        println("The name is $name")
        return "Hello, $name!"
    }
}
