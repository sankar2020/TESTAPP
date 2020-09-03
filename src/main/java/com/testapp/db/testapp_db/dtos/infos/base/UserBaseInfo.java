package com.testapp.db.testapp_db.dtos.infos.base;

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
 *  FOR CUSTOMIZE UserInfoDto PLEASE EDIT ../UserInfo.java
 * 
 *  -- THIS FILE WILL BE OVERWRITTEN ON THE NEXT SKAFFOLDER CODE GENERATION --
 * 
 */
 

/**
 * This is the info of User object
 * 
 */

import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class UserBaseInfo {
	
	private Long _id;
	// Attributes
	private String username;
    private String password;
    private String token;
    private String Email;
    private String ProfileType;
    private Boolean RegistrationStatus;
    private String RoleType;
    private String SubscriptionType;
    private String UserType;
	
	public Long get_id() {
		return _id;
	}

	public void set_id(Long id) {
		this._id = id;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getProfileType() {
		return ProfileType;
	}

	public void setProfileType(String ProfileType) {
		this.ProfileType = ProfileType;
	}
	public Boolean getRegistrationStatus() {
		return RegistrationStatus;
	}

	public void setRegistrationStatus(Boolean RegistrationStatus) {
		this.RegistrationStatus = RegistrationStatus;
	}
	public String getRoleType() {
		return RoleType;
	}

	public void setRoleType(String RoleType) {
		this.RoleType = RoleType;
	}
	public String getSubscriptionType() {
		return SubscriptionType;
	}

	public void setSubscriptionType(String SubscriptionType) {
		this.SubscriptionType = SubscriptionType;
	}
	public String getUserType() {
		return UserType;
	}

	public void setUserType(String UserType) {
		this.UserType = UserType;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}