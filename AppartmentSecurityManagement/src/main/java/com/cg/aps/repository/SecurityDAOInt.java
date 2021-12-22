package com.cg.aps.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.SecurityEntity;


@Repository
public interface SecurityDAOInt extends JpaRepository<SecurityEntity, Integer> {
	
//	public List<SecurityEntity> searchByDate(LocalDate alertDate);
//	
//	public List<SecurityEntity> searchByAlertType(String alertType);
	
	
}
