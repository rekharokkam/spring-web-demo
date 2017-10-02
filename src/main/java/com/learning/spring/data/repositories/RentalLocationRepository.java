package com.learning.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.spring.data.entities.RentalLocation;

@Repository
public interface RentalLocationRepository extends JpaRepository<RentalLocation, Integer>//First argument is the type of entity we are trying to persist and second is the type of the primary key for the entity
{
	
}
