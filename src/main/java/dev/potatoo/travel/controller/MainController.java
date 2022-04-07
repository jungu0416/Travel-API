package dev.potatoo.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.potatoo.travel.model.CheckArea;
import dev.potatoo.travel.service.TravelService;

@RestController
@RequestMapping("/api")
public class MainController {
	@Autowired
	private TravelService travelService;
	
	//ResponseEntity 사용하기
	
	@PostMapping("/check/area")
	public List<CheckArea> checkArea() {
		
		
		return travelService.checkArea();
	}
	
	
	// return new ResponseEntity<>( travelService.checkArea() , HttpStatus.OK)
	
	
	
	@PostMapping("/insert/area")
	public ResponseEntity<Object> insertArea() { //JSONObject 넣어보기
		//travelService.insertArea();
		return null;
	}
	
	
	
	
	
	
	
}
