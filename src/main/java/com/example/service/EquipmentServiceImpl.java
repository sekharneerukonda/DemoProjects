package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.response.EquipmentInfoResponse;

@Service
public class EquipmentServiceImpl implements EquipmentService {
	
	/*@Autowired
	EquipmentRepository equipmentRepository;
*/
	@Override
	public EquipmentInfoResponse getEquipmentDetails(String equipmentId) {
		EquipmentInfoResponse equipmentInfoResponse=new EquipmentInfoResponse();
		/*EquipmentInfo equipmentInfo=new EquipmentInfo(); 
		Long id=Long.parseLong(equipmentId);
		Optional<EquipmentInfo> optEquipmentInfo=equipmentRepository.findById(id);
		equipmentInfo=optEquipmentInfo.get();
		equipmentInfoResponse=buildresponse(equipmentInfo);*/
		return equipmentInfoResponse;
	}

	@Override
	public List<EquipmentInfoResponse> getAllEquipments() {
		// TODO Auto-generated method stub
		return null;
	}

	/*private EquipmentInfoResponse buildresponse(EquipmentInfo equipmentInfo) {
		EquipmentInfoResponse equipmentInfoResponse=new EquipmentInfoResponse();
		equipmentInfoResponse.setsNo(String.valueOf(equipmentInfo.getsNo()));
		equipmentInfoResponse.setEquipmentName(equipmentInfo.getEquipmentName());
		equipmentInfoResponse.setLocation(equipmentInfo.getLocation());
		equipmentInfoResponse.setDescription(equipmentInfo.getDescription());
		equipmentInfoResponse.setModel(equipmentInfo.getModel());
		equipmentInfoResponse.setSerialNo(equipmentInfo.getSerialNo());
		equipmentInfoResponse.setVendorName(equipmentInfo.getVendorName());
		equipmentInfoResponse.setImage(equipmentInfo.getImage());
		
		return equipmentInfoResponse;
	}

	@Override
	public List<EquipmentInfoResponse> getAllEquipments() {
		EquipmentInfo equipmentInfo=new EquipmentInfo(); 
		EquipmentInfoResponse equipmentInfoResponse=new EquipmentInfoResponse();
		List<EquipmentInfoResponse> equipmentInfoResponseList=new ArrayList<EquipmentInfoResponse>();
		List<EquipmentInfo> equipmentList=equipmentRepository.findAll();
		for (EquipmentInfo equipmentInfo2 : equipmentList) {
			equipmentInfoResponse=buildresponse(equipmentInfo2);
			equipmentInfoResponseList.add(equipmentInfoResponse);
			
		}
		return equipmentInfoResponseList;
	}
*/
}
