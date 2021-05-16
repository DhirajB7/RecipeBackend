package com.dhiraj.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dhiraj.body.MessageToJson;

@RestController
@RequestMapping("/check")
public class Check {
	
	@GetMapping()
	public MessageToJson checkStatus() {
		return new MessageToJson("Working");
	}

}
