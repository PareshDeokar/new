package com.cg.aps.service;

import java.util.Date;
import java.util.List;

import com.cg.aps.entities.GuardTrainingEntity;




public interface GuardTrainingServiceInt {

	public long add(GuardTrainingEntity bean);
	
	public void update(GuardTrainingEntity bean);
	
	public void delete(GuardTrainingEntity bean);
	
	public GuardTrainingEntity findByPk(long id);
	
	public GuardTrainingEntity findByGuardName(String name);
	
	public List<GuardTrainingEntity> searchByStatus(String status);
	
	public List<GuardTrainingEntity> searchByDate(Date date);
	
	
}
