package com.personal.society.management.app.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.society.management.app.domain.Apartment;
import com.personal.society.management.app.domain.Society;
import com.personal.society.management.app.dto.ResponseDto;
import com.personal.society.management.app.service.SocietyService;

@RestController
@RequestMapping("/society")
public class SocietyController {

	@Autowired
	private SocietyService societyService;

	@PostMapping("/register")
	public ResponseDto register(@RequestBody Society society) {
		try {
			societyService.register(society);
			return new ResponseDto(true, "Society Registered Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseDto(false, e.getMessage());
		}
	}
	
	@PostMapping("/registerapartments")
	public ResponseDto registerApartments(@RequestBody Set<Apartment> apartments) {
		try {
			societyService.registerApartments(apartments);
			return new ResponseDto(true, "Apartments Registered Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseDto(false, e.getMessage());
		}
	}
}
