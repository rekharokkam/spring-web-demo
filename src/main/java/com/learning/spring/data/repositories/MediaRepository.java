package com.learning.spring.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.spring.data.entities.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media, Integer>
{
	//When writing queries they should be written in specific format for Spring to build queries  
	public List<Media> findByTitleLikeAndIsAvailableIsTrue (String title);
	
	public List<Media> findByRating (Integer rating);
}
