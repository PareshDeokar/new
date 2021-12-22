package com.cg.aps.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.VehicleServiceImpl;
@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	@Autowired
	VehicleServiceImpl vehicle;
	@PostMapping("/add")
	public long add(VehicleEntity bean) throws DuplicateRecordException {
		vehicle.add(bean);
		return 0;
	}
	
	@PostMapping("/update")
	public void update(VehicleEntity bean) throws RecordNotFoundException {
		vehicle.update(bean);
		
	}

	
//	@GetMapping("/findbyname")
//	public void searchByDate(Date date) throws RecordNotFoundException {
//		vehicle.searchByDate(date);		
//	}
	
	@GetMapping("/findbypk")
	public VehicleEntity findByPk(String id) throws RecordNotFoundException {
		return vehicle.findByPk(id);
	}

	

}
