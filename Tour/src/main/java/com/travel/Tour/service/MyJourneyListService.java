package com.travel.Tour.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.Tour.entity.MyJourneyList;
import com.travel.Tour.repository.MyJourneyRepository;

@Service
public class MyJourneyListService {
	
	@Autowired
	private MyJourneyRepository myjourney; 
	
	public void saveMyJourney(MyJourneyList j) {
		myjourney.save(j);
	}
	public List<MyJourneyList> getAllTickets(){
		
		return myjourney.findAll();
	}
	public void deleteById(int id) {
		myjourney.deleteById(id);
	}
}
