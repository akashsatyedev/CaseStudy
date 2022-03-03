package com.cropdealapplication.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cropdealapplication.models.*;

public interface DealerRepo extends MongoRepository<Dealer, Integer>{

	void insert(Admin admin); 

	

}