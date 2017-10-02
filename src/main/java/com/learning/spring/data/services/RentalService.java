package com.learning.spring.data.services;

//import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring.data.repositories.MediaRepository;
import com.learning.spring.data.repositories.RentalRepository;
import com.learning.spring.data.entities.Media;
import com.learning.spring.data.entities.Rental;

@Service
public class RentalService
{
	@Autowired
	private MediaRepository mediaRepo;
	
//	@Autowired
//	private RentalRepository rentalRepo;
	
	@Transactional
	public List<Media> findTitle (String title){
		return mediaRepo.findByTitleLikeAndIsAvailableIsTrue(title);
	}
	
	@Transactional
	public void rent (Media media){
		
//		Rental rental = new Rental();
//		rental.setMedia(media);
//		rental.setPickupDate(new Date());
//		rental.setPickupLocation(media.getRentalLocation());
		
		media.setAvailable(false);
//		media.getRentalLocation().getMedia().remove(media);
//		media.setRentalLocation(null);
		
		mediaRepo.save(media);
//		rentalRepo.save(rental);
	}
	
	public Media findById (Integer mediaId){
		return mediaRepo.findOne(mediaId);
	}
	
	public void addMedia (Media media){
		mediaRepo.save(media);
	}
}
