package com.testapp.db.testapp_db.entity;

import javax.persistence.Entity;
import com.testapp.db.testapp_db.entity.base.UserInfoBase;

@Entity
public class UserInfo extends UserInfoBase {

    public UserInfo() {}

    public UserInfo(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}
