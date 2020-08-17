package com.canalogies.aop;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	
	public void addAccount(Account theAccount,boolean val) {
		System.out.println("Account DOA function is invoked");
	}
}
