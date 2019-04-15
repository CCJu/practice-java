package com.imooc.action;

import com.opensymphony.xwork2.ActionSupport;

public class helloWorld extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("这是action");
		return SUCCESS;
	}
	
}
