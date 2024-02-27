package com.travel.Tour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.travel.Tour.service.MyJourneyListService;


@Controller
public class MyJourneyListController {
	
	@Autowired
	private MyJourneyListService service;
	
	@RequestMapping("/deleteMyList/{id}")	
	public String deleteMyList(@PathVariable("id") int id){
		service.deleteById(id);
		return "redirect:/my_journey";
		
	}
}



