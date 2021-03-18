package pl.gocoffee.coffee

import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Query.query
import org.springframework.data.mongodb.core.query.Criteria.where
import org.springframework.stereotype.Repository

@Repository
class CoffeeRepository(
        private val mongoTemplate: MongoTemplate
) {

    fun getCoffee(): CoffeeDetails {
        return mongoTemplate.find(query(where("name").`is`("test")), CoffeeDetails::class.java).first()
    }
}