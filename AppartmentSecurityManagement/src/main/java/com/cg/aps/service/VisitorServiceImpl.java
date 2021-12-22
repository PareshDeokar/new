package com.cg.aps.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.VehicleDAOInt;
import com.cg.aps.repository.VisitorDAOInt;
@Service
public class VisitorServiceImpl implements VisitorServiceInt {
	@Autowired
	VisitorDAOInt visitorDao;
	
	@Override
	public VisitorEntity addVisitor(VisitorEntity bean) throws DuplicateRecordException {
		
		return visitorDao.save(bean);
		
	}

	@Override
	public VisitorEntity update(VisitorEntity bean) throws RecordNotFoundException   {
		
		return visitorDao.save(bean);
		

	
	}

	

//
//	@Override
//	public VisitorEntity findByName(String name) throws RecordNotFoundException {
//		try {
//			return findByName(name);
//		} catch (DataAccessException e) {
//			throw new RecordNotFoundException(e.getMessage());
//		}
//		catch (Exception e) {
//			throw new RecordNotFoundException(e.getMessage());
//		}
//	}
//	

	@Override
	public VisitorEntity findByPk(Integer id) throws RecordNotFoundException {
		try {
			Optional<VisitorEntity> optional = visitorDao.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			throw new Exception("InvalidId");
		}			
		}
		catch (DataAccessException e) {
			throw new RecordNotFoundException(e.getMessage());
		}
		catch (Exception e) {
			throw new RecordNotFoundException(e.getMessage());
		}

	}

	@Override
	public List<VisitorEntity> findByVisitorName(String name) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VisitorEntity> searchByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<VisitorEntity> search(VisitorEntity bean, int pageNo, int pageSize) {
//		try{
//			PageRequest paging = PageRequest.of(pageNo, pageSize);
//		
//		Page<VisitorEntity> pageResult= visitorDao.findAll(pageNo,pageSize);
//		Optional<VisitorEntity> optional=visitorDao.findById(bean);
//		if (pageResult.hasContent())
//		{
//		
//			return optional.get();
//		}
//		else
//		{
//			throw
//		}
//		}
	

}