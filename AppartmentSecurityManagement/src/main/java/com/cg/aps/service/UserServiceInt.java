package com.cg.aps.service;

import java.util.List;

import com.cg.aps.entities.UserEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;

public interface UserServiceInt {

	public long add(UserEntity bean) throws DuplicateRecordException;
	
	public void update(UserEntity bean) throws RecordNotFoundException;
	
	public void delete(UserEntity bean) throws RecordNotFoundException;
	
	public UserEntity findByLogin(String login) throws RecordNotFoundException;
	
	public UserEntity findByPk(long id) throws RecordNotFoundException;
	
	public UserEntity authenticate(UserEntity bean);
	
	public boolean changePassword(Long id, String oldPassword,
            String newPassword) ;
    

    public long registerUser(UserEntity bean);
    
    public boolean forgetPassword(String login);
	
}
