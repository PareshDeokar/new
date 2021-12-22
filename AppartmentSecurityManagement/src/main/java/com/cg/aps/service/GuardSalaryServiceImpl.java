package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.GuardSalaryEntity;
import com.cg.aps.entities.UserEntity;
import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.GuardSalaryDAOInt;

@Service
public class GuardSalaryServiceImpl implements GuardSalaryServiceInt {
	@Autowired
	GuardSalaryDAOInt GuardSalaryDao;
	
	@Override
	public long add(GuardSalaryEntity bean)throws DuplicateRecordException{
		// TODO Auto-generated method stub
		try
		{
			GuardSalaryDao.save(bean);
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
	public void update(GuardSalaryEntity bean)throws RecordNotFoundException {
		// TODO Auto-generated method stub
		try 
		{
			GuardSalaryDao.save(bean);
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

	@Override
	public void delete(GuardSalaryEntity bean)throws RecordNotFoundException {
		try
		{
			GuardSalaryDao.delete(bean);
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
//	public List<GuardSalaryEntity> findByGuardName(String name)throws RecordNotFoundException {
//		try {
//			return (List<GuardSalaryEntity>) GuardSalaryDao.findByGuardName(name);
//		}
//		catch (DataAccessException e) {
//			throw new RecordNotFoundException(e.getMessage());
//		}
//		catch (Exception e) {
//			throw new RecordNotFoundException(e.getMessage());
//		}
//	}

	@Override
	public GuardSalaryEntity findByPk(Integer id)throws RecordNotFoundException {
		try
		{
			Optional<GuardSalaryEntity> optional=GuardSalaryDao.findById(id);
			if(optional.isPresent())
			{
				return optional.get();
			}
			else
			{
				throw new Exception("InvalidId");
			}
		}
		 catch(DataAccessException e)
		{
			 throw new RecordNotFoundException(e.getMessage());
		}
		catch(Exception e)
		{
			throw new RecordNotFoundException(e.getMessage());
		}
//return null;
	}

	@Override
	public List<GuardSalaryEntity> findByGuardName(String name) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
