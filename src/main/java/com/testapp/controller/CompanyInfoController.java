package com.testapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.testapp.controller.base.CompanyInfoBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/TESTAPP.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class CompanyInfoController extends CompanyInfoBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
