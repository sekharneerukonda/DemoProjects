package com.example.service;

import java.util.List;

import com.example.response.EquipmentInfoResponse;

public interface EquipmentService {

	EquipmentInfoResponse getEquipmentDetails(String equipmentId);

	List<EquipmentInfoResponse> getAllEquipments();
	
}
