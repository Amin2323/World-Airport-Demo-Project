package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Airport;
//import com.example.model.Hotel;

@RestController
@RequestMapping("/airport")
public class Controller {
	
	private HotelRepository hotelRepository;
	
	public Controller(HotelRepository hotelRepository) {
		//super();
		this.hotelRepository = hotelRepository;
	}
	

	@GetMapping("/all")
    public List<Airport> getAll(){
	  List<Airport> airports = this.hotelRepository.findAll();
	return airports;
	    
  }
	@PutMapping
	public void insert(@RequestBody Airport airport){
		this.hotelRepository.insert(airport);
	}
	
	@PostMapping
	public void update(@RequestBody Airport airport){
		this.hotelRepository.save(airport);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id){
		this.hotelRepository.delete(id);
	}
	
	@GetMapping("/{id}")
	public Airport getById(@PathVariable("id") String id){
		Airport hotel = this.hotelRepository.findById(id);
		return hotel;
	}
	
	@GetMapping("/{country}")
	public Airport getByName(@PathVariable("country") String country){
		Airport hotel = this.hotelRepository.findByName(country);
		return hotel;
	}
}
