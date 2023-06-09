package com.example.controllers

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class Hello {
    @Get("/hello")
    fun hello(): HttpResponse<String> = HttpResponse.ok("Hello! Benjamin")
}