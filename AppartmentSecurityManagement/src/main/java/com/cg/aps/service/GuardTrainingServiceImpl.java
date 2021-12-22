package com.cg.aps.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.GuardTrainingEntity;
@Service
public class GuardTrainingServiceImpl implements GuardTrainingServiceInt {

	@Override
	public long add(GuardTrainingEntity bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(GuardTrainingEntity bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(GuardTrainingEntity bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public GuardTrainingEntity findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GuardTrainingEntity findByGuardName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GuardTrainingEntity> searchByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GuardTrainingEntity> searchByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
