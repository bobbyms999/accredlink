package com.accredilink.bgv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accredilink.bgv.dto.RegistrationDTO;
import com.accredilink.bgv.service.RegistrationService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;

	@PostMapping("/register")
	public String registration(@RequestBody RegistrationDTO registrationDTO) throws Exception {
		System.out.println(registrationDTO);
		return registrationService.registration(registrationDTO);
	}

	
}