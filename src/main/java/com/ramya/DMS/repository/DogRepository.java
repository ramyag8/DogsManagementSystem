package com.ramya.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ramya.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
