package com.canalogies.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	
	//logging aspect
	//call before aspect
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.canalogies.aop.AccountDAO.addAccount())")
	//@Before("execution(public void add*())")
	//@Before("execution(* add*())")
	//@Before("execution(* add*(com.canalogies.aop.Account))")
	//@Before("execution(* add*(..))")
	@Before("execution(* com.canalogies.aop.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("=========> called before Add account");
	}
}
