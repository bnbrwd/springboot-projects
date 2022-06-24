package com.example.curd.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.curd.model.DemoUser;

public interface CurdRepository extends MongoRepository<DemoUser, Integer>{

}
