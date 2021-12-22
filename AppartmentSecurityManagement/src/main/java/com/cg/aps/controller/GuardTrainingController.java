package com.cg.aps.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.SecurityEntity;
import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.GuardTrainingServiceImpl;
import com.cg.aps.service.SecurityServiceInt;
import com.cg.aps.service.VehicleServiceInt;
import com.cg.aps.service.VisitorServiceInt;

@RestController
@RequestMapping("/guard")
public class GuardTrainingController {
	@Autowired 
	GuardTrainingServiceImpl security;
	
	
}
