package com.canalogies.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO=context.getBean("accountDAO",AccountDAO.class);
		
		accountDAO.addAccount(new Account(),true);
		accountDAO.setName("hello");
		accountDAO.setServiceCode("ca");
		
		accountDAO.getName();
		accountDAO.getServiceCode();
		
		MemberShipDAO mambershipDAO=context.getBean("memberShipDAO",MemberShipDAO.class);
		
		mambershipDAO.addAccount();
		
		context.close();
	}
	
}
