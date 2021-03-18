package pl.gocoffee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GoCoffeeApplication

fun main(args: Array<String>) {
	runApplication<GoCoffeeApplication>(*args)
}
