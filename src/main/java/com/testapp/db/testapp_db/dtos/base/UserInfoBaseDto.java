package com.testapp.db.testapp_db.dtos.base;

/**
 * 
 * 
  _____                      _              _ _ _     _   _     _        __ _ _      
 |  __ \                    | |            | (_) |   | | | |   (_)      / _(_) |     
 | |  | | ___    _ __   ___ | |_    ___  __| |_| |_  | |_| |__  _ ___  | |_ _| | ___ 
 | |  | |/ _ \  | '_ \ / _ \| __|  / _ \/ _` | | __| | __| '_ \| / __| |  _| | |/ _ \
 | |__| | (_) | | | | | (_) | |_  |  __/ (_| | | |_  | |_| | | | \__ \ | | | | |  __/
 |_____/ \___/  |_| |_|\___/ \__|  \___|\__,_|_|\__|  \__|_| |_|_|___/ |_| |_|_|\___|
 
                                                                                   
 * DO NOT EDIT THIS FILE!! 
 *
 *  FOR CUSTOMIZE UserInfoBaseDto PLEASE EDIT ../UserInfoDto.java
 * 
 *  -- THIS FILE WILL BE OVERWRITTEN ON THE NEXT SKAFFOLDER CODE GENERATION --
 * 
 */
 

/**
 * This is the dto of UserInfo object
 * 
 */

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import com.testapp.db.testapp_db.entity.UserInfo;
// Import relations

public class UserInfoBaseDto {
	
	private Long _id;
	
	// Attributes
    private String Address;
    private Boolean Company;
    private String Country;
    private String Firstname;
    private String Lastname;
    private String WebsiteAddr;
	
	
	
	public Long get_id() {
		return _id;
	}

	public void set_id(Long id) {
		this._id = id;
	}
	
	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}
	public Boolean getCompany() {
		return Company;
	}

	public void setCompany(Boolean Company) {
		this.Company = Company;
	}
	public String getCountry() {
		return Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}
	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String Firstname) {
		this.Firstname = Firstname;
	}
	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}
	public String getWebsiteAddr() {
		return WebsiteAddr;
	}

	public void setWebsiteAddr(String WebsiteAddr) {
		this.WebsiteAddr = WebsiteAddr;
	}
    

    
}