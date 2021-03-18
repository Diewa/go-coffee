package pl.gocoffee.coffee

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "coffee")
data class CoffeeDetails(
        val name: String,
        val producer: String) {
}