package com.cg.aps.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.UserEntity;

@Repository
  public interface UserDAOInt extends JpaRepository<UserEntity,Long> {
	
//	public UserEntity findByLogin(String login);
//	
	}
