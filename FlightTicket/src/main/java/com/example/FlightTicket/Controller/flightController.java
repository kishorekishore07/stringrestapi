package com.example.FlightTicket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlightTicket.Brave.FlightSample;
import com.example.FlightTicket.Service.flightService;

@RestController
public class flightController {
@Autowired
public flightService fserv;
@PostMapping("/saveticket")
public FlightSample addDetails(@RequestBody FlightSample sm)
{
	return fserv.addDetails(sm);
}

@GetMapping("/getTicket")
public List<FlightSample> getDetails()
{
	return fserv.getDet();
}

@PutMapping("/updateTicket")
public FlightSample updateDetails(@RequestBody FlightSample uf)
{
	return fserv.updateInfo(uf);
}

@DeleteMapping("/deleteTicket/{id}")
public String deleteDetails(@PathVariable("id")int id)
{
	fserv.deleteInfo(id);
	return "Passenger ID "+id+" Deleted";
}
}
