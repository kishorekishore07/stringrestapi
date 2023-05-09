package com.example.FlightTicket.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlightTicket.Brave.FlightSample;
import com.example.FlightTicket.Repository.flightRepo;

@Service
public class flightService {
@Autowired
public flightRepo frepo;

//post
public FlightSample addDetails(FlightSample fn)
{
	return frepo.save(fn);
}

//get
public List<FlightSample> getDet()
{
	return frepo.findAll();
}

//update
public FlightSample updateInfo(FlightSample fu)
{
	return frepo.saveAndFlush(fu);
}

//delete
public void deleteInfo(int id)
{
	frepo.deleteById(id);
}

}
