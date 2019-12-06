package com.meetstone.project.service;

import java.util.List;

import com.meetstone.project.dao.entity.AcountEntity;

public interface AcountService {
	List<AcountEntity> GetAllInfo();
	void SignUp(AcountEntity acount);
	
}
