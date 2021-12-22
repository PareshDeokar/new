package com.cg.aps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.GuardSalaryEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.GuardSalaryServiceImpl;

@RestController
@RequestMapping("/guardsalary")
public class GuardSalaryController {
	@Autowired
	GuardSalaryServiceImpl guardSalary;
	@PostMapping("/add")
	public long add(GuardSalaryEntity bean)throws DuplicateRecordException{
		guardSalary.add(bean);
		return 0;
	}
	
	@PostMapping("/update")
	public void update(GuardSalaryEntity bean)throws RecordNotFoundException {
		guardSalary.update(bean);
	}
	
	
	@GetMapping("/findbyname")
	public List<GuardSalaryEntity> findByName3(String name) throws RecordNotFoundException {
		return guardSalary.findByGuardName(name);
	}
	
	@GetMapping("/findbypk")
	public GuardSalaryEntity findByPk1(Integer id)throws RecordNotFoundException {
		return guardSalary.findByPk(id);
	}
	

}
