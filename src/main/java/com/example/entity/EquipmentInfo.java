package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EquipmentInfo")
public class EquipmentInfo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long sNo;
	@Column(name="Equipment_Name")
	private String equipmentName;
	@Column(name="Vendor_Name")
	private String vendorName;
	@Column(name="Location")
	private String location;
	@Column(name="Model")
	private String model;
	@Column(name="Serial_No")
	private String serialNo;
	@Column(name="Description")
	private String description;
	@Column(name="Image")
	private String image;
	
	public Long getsNo() {
		return sNo;
	}
	public void setsNo(Long sNo) {
		this.sNo = sNo;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}