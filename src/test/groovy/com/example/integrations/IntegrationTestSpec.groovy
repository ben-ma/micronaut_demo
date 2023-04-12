package com.example.integrations

import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

import java.net.http.HttpRequest

@MicronautTest
class IntegrationTestSpec extends Specification {

    @Inject
    HttpClient client

    def 'integration test'() {
        when:
        HttpRequest request = HttpRequest.GET(URI.create("/hello"))

        def response = client.toBlocking().exchange(request, String)

        then:
        response.status.code == 200
    }

}
