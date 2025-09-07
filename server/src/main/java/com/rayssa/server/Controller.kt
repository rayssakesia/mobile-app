package com.rayssa.server

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(value = ["/users"])
class Controller {

    @GetMapping
    fun getAnswer () : String {
        return "I'm ready ray"
    }
}