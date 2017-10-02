package com.learning.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.spring.data.entities.Rental;


public interface RentalRepository extends JpaRepository<Rental, Integer>
{

}
