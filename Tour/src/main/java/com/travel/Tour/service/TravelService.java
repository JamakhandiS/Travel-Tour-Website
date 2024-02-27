package com.travel.Tour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.Tour.entity.Travel;
import com.travel.Tour.repository.TravelRepository;

@Service
public class TravelService {
	
	@Autowired
	private TravelRepository trvRepo;
	
	public void save(Travel t) {
		trvRepo.save(t);
	}
	public List<Travel> getAllTickets(){
		return trvRepo.findAll();
	}
    public Travel getTravelById(int id) {
    	return trvRepo.findById(id).get();
    }
    public void deleteById(int id) {
    	trvRepo.deleteById(id);
    }
}

