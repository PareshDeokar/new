package com.cg.aps.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.aps.entities.FlatEntity;
@Service
public class FlatServiceImpl implements FlatServiceInt {

	@Override
	public long add(FlatEntity bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(FlatEntity bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(FlatEntity bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public FlatEntity findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatEntity findByPk(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlatEntity> search(String floorNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlatEntity> searchByFlatType(String flatType) {
		// TODO Auto-generated method stub
		return null;
	}

}
