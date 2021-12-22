package com.cg.aps.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.UserEntity;
import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.VehicleDAOInt;

import net.bytebuddy.asm.Advice.Enter;

@Service
public class VehicleServiceImpl implements VehicleServiceInt {
	@Autowired
	VehicleDAOInt vehicleDao;

	@Override
	public long add(VehicleEntity bean) throws DuplicateRecordException {
		try {
			vehicleDao.save(bean);
			return 0;			
		}
		catch (DataAccessException e) {
			throw new DuplicateRecordException(e.getMessage());
		}
		catch (Exception e) {
			throw new DuplicateRecordException(e.getMessage());
		}
		
	}

	@Override
	public void update(VehicleEntity bean) throws RecordNotFoundException {
		try {
			vehicleDao.save(bean);
		} 
		catch (DataAccessException e) {
			throw new RecordNotFoundException(e.getMessage());
		}
		catch (Exception e) {
			throw new RecordNotFoundException(e.getMessage());
		}
		
		
	}



//	@Override
//	public List<VehicleEntity> searchByDate(Date date) throws RecordNotFoundException {
//		try {
//			return vehicleDao.searchByDate(date);
//		}
//		catch (DataAccessException e) {
//			throw new RecordNotFoundException(e.getMessage());
//		}
//		catch (Exception e) {
//			throw new RecordNotFoundException(e.getMessage());
//		}
//	}

	@Override
	public VehicleEntity findByPk(String id) throws RecordNotFoundException {
		try {
			Optional<VehicleEntity> optional = vehicleDao.findById(id);
			if (optional.isPresent()) {
				return optional.get();
			}
			else {
				throw new Exception("invalidId");
			}			
		}
		
		catch (Exception e) {
			throw new RecordNotFoundException(e.getMessage());
		}
	}

	@Override
	public VehicleEntity findByName(String name) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VehicleEntity> searchByVehicleType(String vehicleType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VehicleEntity> searchByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}


}


	