package com.cg.aps.service;

import java.util.Date;
import java.util.List;

import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;



public interface VisitorServiceInt {

	public VisitorEntity addVisitor(VisitorEntity bean) throws DuplicateRecordException;
	
	public VisitorEntity update(VisitorEntity bean) throws RecordNotFoundException;
	
	public List<VisitorEntity> findByVisitorName(String name) throws RecordNotFoundException;
	
	public VisitorEntity findByPk(Integer id) throws RecordNotFoundException;
	
	public List<VisitorEntity> searchByDate(Date date);
	
	
	
}
