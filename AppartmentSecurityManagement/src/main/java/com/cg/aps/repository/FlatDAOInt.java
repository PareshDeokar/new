package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.FlatEntity;


@Repository
public interface FlatDAOInt extends JpaRepository<FlatEntity, Integer>{
	
//	public FlatEntity findByName(String name);
//	
//	public List<FlatEntity> search(String floorNo);
//	
//	public List<FlatEntity> searchByFlatType(String flatType);
	
	
	
}
