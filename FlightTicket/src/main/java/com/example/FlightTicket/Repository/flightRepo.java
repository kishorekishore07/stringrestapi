package com.example.FlightTicket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FlightTicket.Brave.FlightSample;

public interface flightRepo extends JpaRepository<FlightSample, Integer> {

}
