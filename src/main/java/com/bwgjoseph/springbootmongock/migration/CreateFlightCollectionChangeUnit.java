package com.bwgjoseph.springbootmongock.migration;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.bwgjoseph.springbootmongock.Flight;

import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;

@ChangeUnit(id = "create-collection", order = "1", author = "bwgjoseph")
public class CreateFlightCollectionChangeUnit {
    private final MongoTemplate mongoTemplate;

    public CreateFlightCollectionChangeUnit(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Execution
    public void execution() {
        mongoTemplate.createCollection("flight");
        mongoTemplate.insert(Flight.builder().name("test112").build());
        mongoTemplate.insert(Flight.builder().name("test113").build());
    }

    @RollbackExecution
    public void rollbackExecution() {

    }
}
