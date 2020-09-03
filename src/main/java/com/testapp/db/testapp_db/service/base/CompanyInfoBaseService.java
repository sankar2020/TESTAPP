package com.testapp.db.testapp_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import com.testapp.db.testapp_db.entity.CompanyInfo;

import com.testapp.db.testapp_db.repositories.CompanyInfoRepository;

@Service
@Transactional
public class CompanyInfoBaseService {

	
	@Autowired
	CompanyInfoRepository companyinfoRepository;


    // CRUD METHODS
    
    // CRUD - CREATE
    
	public CompanyInfo insert(CompanyInfo companyinfo) {
		return companyinfoRepository.save(companyinfo);
	}
	
	// CRUD - REMOVE
    
	public void delete(Long id) {
		companyinfoRepository.delete(id);
	}

	// CRUD - GET ONE
    	
	public CompanyInfo getOne(Long id) {
		return companyinfoRepository.findOne(id);
	}

    	
    // CRUD - GET LIST
    	
	public List<CompanyInfo> getAll() {
		List<CompanyInfo> list = new ArrayList<>();
		companyinfoRepository.findAll().forEach(list::add);
		return list;
	}
	

}
