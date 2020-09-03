package com.testapp.db.testapp_db.entity;

import javax.persistence.Entity;
import com.testapp.db.testapp_db.entity.base.CompanyInfoBase;

@Entity
public class CompanyInfo extends CompanyInfoBase {

    public CompanyInfo() {}

    public CompanyInfo(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}
