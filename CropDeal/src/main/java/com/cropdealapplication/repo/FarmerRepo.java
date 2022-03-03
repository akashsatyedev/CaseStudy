package com.cropdealapplication.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cropdealapplication.models.*;

public interface FarmerRepo extends MongoRepository<Farmer, Integer>{ 

	

}