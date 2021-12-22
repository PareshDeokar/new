package com.cg.aps.controller;

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

import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.VisitorServiceImpl;

@RestController
@RequestMapping("/visitors")
public class VisitorController {
	
	@Autowired
	VisitorServiceImpl visitorService;
	
	@PostMapping("/addvisitor")
	public ResponseEntity<VisitorEntity> add(@RequestBody VisitorEntity visitor) throws DuplicateRecordException {
		return new ResponseEntity<VisitorEntity>(visitorService.addVisitor(visitor), HttpStatus.OK);
	}
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Visitor not added")
	@ExceptionHandler({DuplicateRecordException.class})
	public void handleException() {

	}
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Visitor not added")
	@ExceptionHandler({UserException.class})
	public void handleException1() {

	}
	
	@PostMapping("/update")
	public void update(VisitorEntity bean) throws RecordNotFoundException
	{
		visitorService.update(bean);
	}
	
	
	@GetMapping("/findbyname")
	public List<VisitorEntity> findByVisitorName(String name) throws RecordNotFoundException
	{
		return visitorService.findByVisitorName(name);
		
	}
	
	@GetMapping("/findbypk")
	public VisitorEntity findByPk4(Integer id) throws RecordNotFoundException{
		return visitorService.findByPk(id);
	}

}
