package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.EquipmentInfoResponse;
import com.example.service.EquipmentService;

@RestController
@RequestMapping("/api/usermanagement")
public class UserManagementController {
	
	@Autowired
	EquipmentService equipmentService;
	
	@Autowired
	Environment env;

	@GetMapping("/getEquipmentDetailsById")
	public @ResponseBody EquipmentInfoResponse getEquipmentDetails(@RequestParam("equipmentId") String equipmentId)
	{
		EquipmentInfoResponse equipmentInfoResponse=new EquipmentInfoResponse();
		equipmentInfoResponse=equipmentService.getEquipmentDetails(equipmentId);
		return equipmentInfoResponse;
		
	}
	
	@GetMapping("/login")
	public @ResponseBody String userLogin()
	{
		String welcomeMsg="Welcome "+env.getProperty("spring.security.user.name","Ammu").toUpperCase();
		return welcomeMsg;
		
	}
}
