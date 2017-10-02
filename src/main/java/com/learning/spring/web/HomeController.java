package com.learning.spring.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.spring.data.entities.Media;
import com.learning.spring.data.services.RentalService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private RentalService rentalService;
	
	@RequestMapping (value="/", method=RequestMethod.GET)
	public String search (){
		return "search";
	}
	
	@RequestMapping (value="add")
	public String add (Media media){
		rentalService.rent(media);
		return "search";
	}
	
	@RequestMapping (value="search")
	public String results (@RequestParam ("title") String title, Model model){
		model.addAttribute("title", title);
		model.addAttribute("titles", rentalService.findTitle("%" + title + "%"));
		
		return "result";
	}
	
	@RequestMapping (value="rent/{mediaId}")
	public String rent (@PathVariable ("mediaId") Integer mediaId, Model model ){
		Media media = rentalService.findById(mediaId);
		rentalService.rent(media);

		model.addAttribute("title", media.getTitle());
//		model.addAttribute("location", media.getRentalLocation().getName());
		
		rentalService.rent(media);
		return "complete";
	}
	
	@RequestMapping (value="addMedia")
	public String addMedia (){
		return "addMedia";
	}
	
}
