
package com.cg.aps.service;

import java.util.List;
import com.cg.aps.entities.GuardShiftEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;



public interface GuardShiftServiceInt {

	public long add(GuardShiftEntity bean) throws DuplicateRecordException;
	
	public void update(GuardShiftEntity bean) throws RecordNotFoundException;
	
	public void delete(GuardShiftEntity bean) throws RecordNotFoundException;
	
	public GuardShiftEntity findByName(String name) throws RecordNotFoundException;
	
	public GuardShiftEntity findByPk(Integer id) throws RecordNotFoundException;
	
	public List<GuardShiftEntity> search(GuardShiftEntity bean, long pageNo, int pageSize);
	
	public List<GuardShiftEntity> search(GuardShiftEntity bean);
	
}