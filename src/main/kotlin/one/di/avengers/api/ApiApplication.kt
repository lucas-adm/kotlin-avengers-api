package one.di.avengers.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = ["one.di.avengers.api.resources.avenger"])
class ApiApplication

fun main(args: Array<String>) {
	runApplication<ApiApplication>(*args)
}
