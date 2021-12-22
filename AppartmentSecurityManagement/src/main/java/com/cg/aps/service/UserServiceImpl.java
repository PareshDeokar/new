package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.UserEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.UserDAOInt;
@Service
public class UserServiceImpl implements UserServiceInt{
	@Autowired
	UserDAOInt userDao;
	
	
	@Override
	public long add(UserEntity bean) throws DuplicateRecordException {
			try
			{
				userDao.save(bean);
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
	public void update(UserEntity bean) throws RecordNotFoundException {
		
		try 
		{
			userDao.save(bean);
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
	public void delete(UserEntity bean) throws RecordNotFoundException {
		try
		{
			userDao.delete(bean);
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
//	public UserEntity findByLogin(String login) throws RecordNotFoundException {
//		try
//		{
//			return userDao.findByLogin(login);
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
	public UserEntity findByPk(long id) throws RecordNotFoundException {
		try
		{
			Optional<UserEntity> optional=userDao.findById(id);
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
		
	}


	@Override
	public UserEntity authenticate(UserEntity bean) {
		return bean;
	}

	@Override
	public boolean changePassword(Long id, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long registerUser(UserEntity bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean forgetPassword(String login) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserEntity findByLogin(String login) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
