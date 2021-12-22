package com.cg.aps.controller;

import java.util.Date;
import java.util.List;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.GuardSalaryEntity;
import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.FlatServiceImpl;
import com.cg.aps.service.FlatServiceInt;
import com.cg.aps.service.GuardSalaryServiceImpl;
import com.cg.aps.service.GuardSalaryServiceInt;
import com.cg.aps.service.GuardShiftServiceImpl;
import com.cg.aps.service.GuardShiftServiceInt;
import com.cg.aps.service.GuardTrainingServiceInt;
import com.cg.aps.service.SecurityServiceImpl;
import com.cg.aps.service.SecurityServiceInt;
import com.cg.aps.service.VehicleServiceImpl;
import com.cg.aps.service.VehicleServiceInt;
import com.cg.aps.service.VisitorServiceImpl;
import com.cg.aps.service.VisitorServiceInt;

@RestController
@RequestMapping("/admin")
public class AdminController {

	
	
	@Autowired
	SecurityServiceImpl security;
	

	@Autowired
	VisitorServiceImpl visitorservice;
	@PostMapping("/addvisitor")
	public ResponseEntity<VisitorEntity> add(@RequestBody VisitorEntity visitor) throws DuplicateRecordException {
		return new ResponseEntity<VisitorEntity>(visitorservice.addVisitor(visitor), HttpStatus.OK);
	}
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Visitor not added")
	@ExceptionHandler({DuplicateRecordException.class})
	public void handleException() {

	}
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="User id not present")
	@ExceptionHandler({UserException.class})
	public void handleException1() {

	}
	
//	
//	@Autowired
//	GuardTrainingServiceImpl guardTraning;
//	
	

	
	
	
	

}
