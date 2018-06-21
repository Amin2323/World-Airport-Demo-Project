package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Airport;
//import com.example.model.Hotel;
//import com.example.model.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Airport, String> {
	Airport findById(String id);
	Airport findByName(String country);
}
