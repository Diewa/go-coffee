package pl.gocoffee.coffee

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/coffee")
class CoffeeController(
        private val repository: CoffeeRepository
) {


    @GetMapping
    fun getCoffee(): CoffeeDetails {
        return repository.getCoffee();
    }
}