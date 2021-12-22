package com.cg.aps.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.VisitorEntity;


@Repository
public interface VisitorDAOInt extends JpaRepository<VisitorEntity,Integer> {
//@Query("Select v from Visitor v where v.visitorName=:name")
//	public List<VisitorEntity> findByVisitorName(String name);
//	
//	public List<VisitorEntity> searchByDate(Date date);
//	
	
}
