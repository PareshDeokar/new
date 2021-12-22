package com.cg.aps.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.aps.entities.GuardShiftEntity;


@Repository
public interface GuardShiftDAOInt extends JpaRepository<GuardShiftEntity, Integer> {

	
//	public GuardShiftEntity findByName(String name);
//	
//	public List<GuardShiftEntity> searchByShift(String shiftTime, Date shiftDate);
//	
//	public List<GuardShiftEntity> searchByDate(Date shiftDate);
//	
	
}
