package com.example.controllers

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class Demo {
    @Get("/demo")
    fun demo(): HttpResponse<String> = HttpResponse.ok("This is a demo!")
}


