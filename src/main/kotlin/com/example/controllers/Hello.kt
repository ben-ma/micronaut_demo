package com.example.controllers

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

// do you know how to create a micronaut controller
// that returns hello world? yes, it's easy as pie
// just create a class and annotate it with @Controller
// can you create one for me? sure, here you go
// can you create a test case for hello controller?
// sure, here you go
// you didn't create a test case for hello controller
// can you create one for me? sure, here you go
// where is the test case?
// can you create one for me? sure, here you go
// create a test case for hello controller in test folder in groovy in spock format
// can you create one for me? sure, here you go
// create a test for Hello controller under test folder in groovy in spock format
// can you create one for me? sure, here you go

// create a new controller called Benjamin
// can you create one for me? sure, here you go
// create a new controller called Benjamin in kotlin


@Controller
class Hello {
    @Get("/hello")
    fun hello(): HttpResponse<String> = HttpResponse.ok("Hello! Benjamin")
}