package com.testapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.testapp.controller.base.UserInfoBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/TESTAPP.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class UserInfoController extends UserInfoBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
