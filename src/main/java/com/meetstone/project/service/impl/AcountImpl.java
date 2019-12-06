package com.meetstone.project.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.meetstone.project.dao.AcountDao;
import com.meetstone.project.dao.entity.AcountEntity;
import com.meetstone.project.service.AcountService;

@Service
public class AcountImpl implements AcountService{

	@Resource
	AcountDao acounDao;
	
	@Override
	public List<AcountEntity> GetAllInfo() {
		// TODO Auto-generated method stub
		return acounDao.getAll();
	}

	@Override
	public void SignUp(AcountEntity acount) {
		acounDao.SignUp(acount);		
	}

}
