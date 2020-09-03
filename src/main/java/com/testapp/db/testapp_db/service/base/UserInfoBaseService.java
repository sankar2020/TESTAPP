package com.testapp.db.testapp_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import com.testapp.db.testapp_db.entity.UserInfo;

import com.testapp.db.testapp_db.repositories.UserInfoRepository;

@Service
@Transactional
public class UserInfoBaseService {

	
	@Autowired
	UserInfoRepository userinfoRepository;


    // CRUD METHODS
    
    // CRUD - CREATE
    
	public UserInfo insert(UserInfo userinfo) {
		return userinfoRepository.save(userinfo);
	}
	
	// CRUD - REMOVE
    
	public void delete(Long id) {
		userinfoRepository.delete(id);
	}

	// CRUD - GET ONE
    	
	public UserInfo getOne(Long id) {
		return userinfoRepository.findOne(id);
	}

    	
    // CRUD - GET LIST
    	
	public List<UserInfo> getAll() {
		List<UserInfo> list = new ArrayList<>();
		userinfoRepository.findAll().forEach(list::add);
		return list;
	}
	

}
