package dev.potatoo.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.potatoo.travel.model.Location;
import dev.potatoo.travel.service.TravelService;

@RestController
@RequestMapping("/api")
public class MainController {
	@Autowired
	private TravelService travelService;
	
	@PostMapping("/check/area")
	public ResponseEntity<Object> checkArea() {
		return new ResponseEntity<>(travelService.checkArea(),HttpStatus.OK);
	}
	
	/* 맨처음 DB에 insert 할때만 */
	@PostMapping("/insert/area")
	public ResponseEntity<Object> insertArea(@RequestBody List<String> location) {
		System.out.println("location : " + location);
		
		return null;
		//return new ResponseEntity<>(travelService.insertArea(location),HttpStatus.OK);
	}
	
	@PostMapping("/update/area")
	public ResponseEntity<Object> updateArea(@RequestBody Location location){
		if(location.getUpdate().equals("Y")) {
			return new ResponseEntity<>(travelService.updateAreaY(location.getLocation()), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(travelService.updateAreaN(location.getLocation()), HttpStatus.OK);
		}
	}
	
	
	
	
	
}
