package com.example.controllers

// write test cases for demo endpoint in spock
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class DemoSpec extends Specification {

    @Inject
    @Client("/")
    HttpClient client

    def "test the demo endpoint"() {
        when:
        def response = client.toBlocking().exchange("/demo", String)

        then:
        response.status == HttpStatus.OK
        response.body() == "Hello World"
    }


}
