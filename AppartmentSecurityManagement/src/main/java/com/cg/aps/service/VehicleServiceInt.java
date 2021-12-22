package com.cg.aps.service;

import java.util.Date;
import java.util.List;

import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;



public interface VehicleServiceInt {

	public long add(VehicleEntity bean) throws DuplicateRecordException;
	
	public void update(VehicleEntity bean) throws RecordNotFoundException;
	
	public VehicleEntity findByName(String name) throws RecordNotFoundException;
	
	public VehicleEntity findByPk(String id) throws RecordNotFoundException;
	
	public List<VehicleEntity> searchByDate(Date date);
	
	public List<VehicleEntity> searchByVehicleType(String vehicleType);
	
	
}
