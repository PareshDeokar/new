
package com.cg.aps.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.GuardShiftEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.GuardShiftDAOInt;

@Service
public class GuardShiftServiceImpl implements GuardShiftServiceInt {

	@Autowired
	GuardShiftDAOInt GuardShiftDAO;
	
	@Override
	public long add(GuardShiftEntity bean) throws DuplicateRecordException {
		
		try
		{
			GuardShiftDAO.save(bean);
			return 0;
		}
		catch(DataAccessException e)
		{
			throw new DuplicateRecordException(e.getMessage());
		}
		catch(Exception e)
		{
			throw new DuplicateRecordException(e.getMessage());
		}
	}
	
	@Override
	public void update(GuardShiftEntity bean) throws RecordNotFoundException 
	{
		try {			
			GuardShiftDAO.save(bean);
		}catch(DataAccessException e) {
			throw new RecordNotFoundException(e.getMessage());
		}catch(Exception e) {
			throw new RecordNotFoundException(e.getMessage());
		}
	}
	
	
	@Override
	public void delete(GuardShiftEntity bean) throws RecordNotFoundException {
		try
		{
			GuardShiftDAO.delete(bean);
		}
		catch(DataAccessException e)
		{
			throw new RecordNotFoundException(e.getMessage());
		}
		catch(Exception e)
		{
			throw new RecordNotFoundException(e.getMessage());
		}
		

	}
//	@Override
//	public GuardShiftEntity findByName(String name) throws RecordNotFoundException {
//		try {	
//		
//	return GuardShiftDAO.findByName(name);
//		}	
//		catch(DataAccessException e)
//		{
//			throw new RecordNotFoundException(e.getMessage());
//		}
//		catch(Exception e)
//		{
//			throw new RecordNotFoundException(e.getMessage());
//		}
//		
//		
//	}
	
	@Override
	public GuardShiftEntity findByPk(Integer id) throws RecordNotFoundException {
		try {			
			Optional<GuardShiftEntity> optional = GuardShiftDAO.findById(id);
			  
			if(optional.isPresent()) {
				return optional.get();
			}else {
				throw new Exception("Invalid id");
			}
			  
		}catch(DataAccessException e) {
			throw new RecordNotFoundException(e.getMessage());
		}catch(Exception e) {
			throw new RecordNotFoundException(e.getMessage());
		}
	}
	
	@Override
	public List<GuardShiftEntity> search(GuardShiftEntity bean, long pageNo, int pageSize){
		
		return null;
	}
	
	@Override
	public List<GuardShiftEntity> search(GuardShiftEntity bean){
		return null;
	}

	@Override
	public GuardShiftEntity findByName(String name) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}

