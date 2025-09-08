package com.rayssa.server

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
class Controller {

    @GetMapping("/users")
    fun getAnswer () : String {
        return "I'm ready ray"
    }
}