package com.example.test.repository;

import com.example.test.models.Demo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DemoRepository extends MongoRepository<Demo, UUID> {
}

