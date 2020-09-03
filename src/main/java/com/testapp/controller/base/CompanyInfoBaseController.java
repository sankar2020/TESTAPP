package com.testapp.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.modelmapper.ModelMapper;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.testapp.db.testapp_db.service.CompanyInfoService;
import com.testapp.db.testapp_db.entity.CompanyInfo;
import com.testapp.db.testapp_db.dtos.CompanyInfoDto;

//IMPORT RELATIONS


public class CompanyInfoBaseController {
    
    @Autowired
	CompanyInfoService companyinfoService;

	

	@Autowired
	private ModelMapper modelMapper;



//CRUD METHODS


    //CRUD - CREATE
    @Secured({ "ROLE_PRIVATE_USER" })
	@PostMapping("/company")
	public ResponseEntity<CompanyInfoDto> insert(@RequestBody CompanyInfo obj) {
				
		
		return ResponseEntity.ok().body(convertToDto(companyinfoService.insert(obj)));
	}

	
    //CRUD - REMOVE
    @Secured({ "ROLE_PRIVATE_USER" })
	@DeleteMapping("/company/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		CompanyInfo companyinfoSelected = companyinfoService.getOne(id);
		
		companyinfoService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
    //CRUD - GET ONE
    @Secured({ "ROLE_PRIVATE_USER" })
	@GetMapping("/company/{id}")
	public ResponseEntity<CompanyInfoDto> get(@PathVariable("id") Long id) {
		CompanyInfo companyinfoSelected = companyinfoService.getOne(id);
		return ResponseEntity.ok().body(convertToDto(companyinfoSelected));
	}
	
	
    //CRUD - GET LIST
    @Secured({ "ROLE_PRIVATE_USER" })
	@GetMapping("/company")
	public ResponseEntity<List<CompanyInfoDto>> getList() {
		List<CompanyInfo> list = companyinfoService.getAll();
		List<CompanyInfoDto> listDto = list.stream()
				.map(companyinfo -> convertToDto(companyinfo))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}


    //CRUD - EDIT
    @Secured({ "ROLE_PRIVATE_USER" })
	@PostMapping("/company/{id}")
	public ResponseEntity<CompanyInfoDto> update(@RequestBody CompanyInfo obj, @PathVariable("id") Long id) {
	    
		
		return ResponseEntity.ok().body(convertToDto(companyinfoService.insert(obj)));
	}
	


/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	private CompanyInfoDto convertToDto(CompanyInfo companyinfo) {
		CompanyInfoDto companyinfoDto = modelMapper.map(companyinfo, CompanyInfoDto.class);
		return companyinfoDto;
	}
}
