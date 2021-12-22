package com.cg.aps.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.SecurityEntity;
@Service
public class SecurityServiceImpl implements SecurityServiceInt {

	@Override
	public long add(SecurityEntity bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(SecurityEntity bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SecurityEntity bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public SecurityEntity findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SecurityEntity findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SecurityEntity> searchByDate(LocalDate alertDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SecurityEntity> searchByAlertType(String alertType) {
		// TODO Auto-generated method stub
		return null;
	}


}
