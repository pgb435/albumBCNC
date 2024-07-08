package es.bcnc.albums

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@OpenAPIDefinition
@SpringBootApplication
class AlbumsApplication

fun main(args: Array<String>) {
	runApplication<AlbumsApplication>(*args)
}
