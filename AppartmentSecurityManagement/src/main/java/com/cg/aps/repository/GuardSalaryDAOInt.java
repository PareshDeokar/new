package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.GuardSalaryEntity;



@Repository
public interface GuardSalaryDAOInt extends JpaRepository<GuardSalaryEntity, Integer>{
	
//	public GuardSalaryEntity findByGuardName(String name);
//	
}
