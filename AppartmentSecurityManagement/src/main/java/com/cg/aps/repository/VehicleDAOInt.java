package com.cg.aps.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.aps.entities.VehicleEntity;


@Repository
public interface VehicleDAOInt extends JpaRepository<VehicleEntity, String> {
	
//	public List<VehicleEntity> searchByDate(Date date);
//	
//	public List<VehicleEntity> searchByVehicleType(String vehicleType);
	
	
}
