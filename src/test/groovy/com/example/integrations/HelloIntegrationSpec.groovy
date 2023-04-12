/*
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.client.exceptions.HttpClientResponseException
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

@MicronautTest
class HelloIntegrationSpec extends Specification {

    @Inject
    @Client("/")
    HttpClient client

    def "test the hello endpoint"() {
        when:
        def response = client.toBlocking().exchange("/hello", String)

        then:
        response.status == HttpStatus.OK
        response.body() == "Hello World"
    }

    def "test Hello endpoint returns 'Hello World'"() {
        given:
        HttpClient client = server.getApplicationContext().createBean(HttpClient)

        when:
        def response = client.toBlocking().exchange("/hello", String)

        then:
        response.status == HttpStatus.OK
        response.body() == "Hello World"
    }

    def "test Hello endpoint returns HTTP status 200"() {
        given:
        HttpClient client = server.getApplicationContext().createBean(HttpClient)

        when:
        def response = client.toBlocking().exchange("/hello", String)

        then:
        response.status == HttpStatus.OK
    }

    def "test Hello endpoint returns correct response headers"() {
        given:
        HttpClient client = server.getApplicationContext().createBean(HttpClient)

        when:
        def response = client.toBlocking().exchange("/hello", String)

        then:
        response.headers["Content-Type"] == "text/plain"
    }

    def "test Hello endpoint returns 'Hello World' for multiple requests"() {
        given:
        HttpClient client = server.getApplicationContext().createBean(HttpClient)

        when:
        10.times {
            def response = client.toBlocking().exchange("/hello", String)
            then:
            response.status == HttpStatus.OK
            response.body() == "Hello World"
        }
    }

    def "test Hello endpoint returns HTTP status 404 for non-existing endpoint"() {
        given:
        HttpClient client = server.getApplicationContext().createBean(HttpClient)

        when:
        def response = { client.toBlocking().exchange("/not-found", String) }

        then:
        def ex = thrown HttpClientResponseException
        ex.response.status == HttpStatus.NOT_FOUND
    }
}
*/