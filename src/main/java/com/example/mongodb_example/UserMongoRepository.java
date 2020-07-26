package com.example.mongodb_example;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<User, String> {

    User findFirstByEmail(String email);
}
