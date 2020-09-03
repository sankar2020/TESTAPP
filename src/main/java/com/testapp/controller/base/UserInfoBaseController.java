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
import com.testapp.db.testapp_db.service.UserInfoService;
import com.testapp.db.testapp_db.entity.UserInfo;
import com.testapp.db.testapp_db.dtos.UserInfoDto;

//IMPORT RELATIONS


public class UserInfoBaseController {
    
    @Autowired
	UserInfoService userinfoService;

	

	@Autowired
	private ModelMapper modelMapper;



//CRUD METHODS


    //CRUD - CREATE
    @Secured({ "ROLE_PRIVATE_USER" })
	@PostMapping("/registrationinfo")
	public ResponseEntity<UserInfoDto> insert(@RequestBody UserInfo obj) {
				
		
		return ResponseEntity.ok().body(convertToDto(userinfoService.insert(obj)));
	}

	
    //CRUD - REMOVE
    @Secured({ "ROLE_PRIVATE_USER" })
	@DeleteMapping("/registrationinfo/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		UserInfo userinfoSelected = userinfoService.getOne(id);
		
		userinfoService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
    //CRUD - GET ONE
    @Secured({ "ROLE_PRIVATE_USER" })
	@GetMapping("/registrationinfo/{id}")
	public ResponseEntity<UserInfoDto> get(@PathVariable("id") Long id) {
		UserInfo userinfoSelected = userinfoService.getOne(id);
		return ResponseEntity.ok().body(convertToDto(userinfoSelected));
	}
	
	
    //CRUD - GET LIST
    @Secured({ "ROLE_PRIVATE_USER" })
	@GetMapping("/registrationinfo")
	public ResponseEntity<List<UserInfoDto>> getList() {
		List<UserInfo> list = userinfoService.getAll();
		List<UserInfoDto> listDto = list.stream()
				.map(userinfo -> convertToDto(userinfo))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}


    //CRUD - EDIT
    @Secured({ "ROLE_PRIVATE_USER" })
	@PostMapping("/registrationinfo/{id}")
	public ResponseEntity<UserInfoDto> update(@RequestBody UserInfo obj, @PathVariable("id") Long id) {
	    
		
		return ResponseEntity.ok().body(convertToDto(userinfoService.insert(obj)));
	}
	


/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	private UserInfoDto convertToDto(UserInfo userinfo) {
		UserInfoDto userinfoDto = modelMapper.map(userinfo, UserInfoDto.class);
		return userinfoDto;
	}
}
