package com.cg.aps.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.GuardTrainingEntity;


@Repository
public interface GuardTrainingDAOInt extends JpaRepository<GuardTrainingEntity, Integer> {

//	
//	public GuardTrainingEntity findByGuardName(String name);
//	
//	public List<GuardTrainingEntity> searchByStatus(String status);
//	
//	public List<GuardTrainingEntity> searchByDate(Date date);
	
	
}
