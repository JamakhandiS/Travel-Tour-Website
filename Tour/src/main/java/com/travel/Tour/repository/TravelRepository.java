package com.travel.Tour.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.Tour.entity.Travel;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Integer> {

}
