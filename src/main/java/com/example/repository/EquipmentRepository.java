package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.EquipmentInfo;

@Repository
public interface EquipmentRepository extends JpaRepository<EquipmentInfo,Long>{		
	}