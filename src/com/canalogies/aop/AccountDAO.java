package com.canalogies.aop;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	 

	public String getName() {
		System.out.println("getter name");
		return name;
	}



	public void setName(String name) {
		System.out.println("setter name");
		this.name = name;
	}



	public String getServiceCode() {
		System.out.println("getter code");
		return serviceCode;
	}



	public void setServiceCode(String serviceCode) {
		System.out.println("setter name");
		this.serviceCode = serviceCode;
	}



	public void addAccount(Account theAccount,boolean val) {
		System.out.println("Account DOA function is invoked");
	}
}
