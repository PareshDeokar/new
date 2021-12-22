package com.cg.aps.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.aps.entities.SecurityEntity;



public interface SecurityServiceInt {

	public long add(SecurityEntity bean);
	
	public void update(SecurityEntity bean);
	
	public void delete(SecurityEntity bean);
	
	public SecurityEntity findByName(String name);
	
	public SecurityEntity findByPk(long id);
	
	public List<SecurityEntity> searchByDate(LocalDate alertDate);
	
	public List<SecurityEntity> searchByAlertType(String alertType);
	
	
}
