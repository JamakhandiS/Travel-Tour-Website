package com.travel.Tour.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.travel.Tour.entity.MyJourneyList;
import com.travel.Tour.entity.Travel;
import com.travel.Tour.service.MyJourneyListService;
import com.travel.Tour.service.TravelService;



@Controller
public class TravelController {
	
	@Autowired
	private TravelService service;
	
	@Autowired
	private MyJourneyListService myJouService;
	
	@GetMapping("/")
	public String home() {
		
		return "home";
	}
	@GetMapping("/tour")
	public String tour() {
		
		return "tour";
	}
	
	@GetMapping("/register")
	public String travelRegister() {
		
		return "travelRegister";
	}
	@GetMapping("/destination")
	public String destination() {
		
		return "destination";
	}
	@GetMapping("/about")
	public String about() {
		
		return "aboutus";
	}
	@GetMapping("/contact")
	public String contact() {
		
		return "contact";
	}

	
	@GetMapping("/wishList")
	public ModelAndView getAllTickets() {
		List<Travel> list = service.getAllTickets();
		return new ModelAndView("ticketList","travel",list);
	}
	
	@PostMapping("/save")
	public String addTravel(@ModelAttribute Travel t) {
		service.save(t);
		return "redirect:/wishList";
	}
	
	@GetMapping("/my_journey")
	public String getMyJourney(Model model) {
		List<MyJourneyList>list= myJouService.getAllTickets();
		model.addAttribute("travel", list);
		
		return "myJourney";
	}
	@RequestMapping("/myList/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Travel t = service.getTravelById(id);
		MyJourneyList mj = new MyJourneyList(t.getId(),t.getState(), t.getPlace() , t.getMode());
		myJouService.saveMyJourney(mj);
		return "redirect:/my_journey";
	}
	
	@RequestMapping("/editTravel/{id}")
	public String editTravel(@PathVariable("id") int id, Model model) {
		Travel t=service.getTravelById(id);
		model.addAttribute("travel",t);
		
		return "travelEdit";
	}
	@RequestMapping("/deleteTravel/{id}")
	public String deleteTravel(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/wishList";
	}
}
