package com.canalogies.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Pointcut("execution(* com.canalogies.aop.*.*(..))")
	public void getAllPoint() {}
	
	//getter pointcut
	@Pointcut("execution(* com.canalogies.aop.*.get*(..))")
	public void getterPoint() {}
	
	//setter pointcut
	@Pointcut("execution(* com.canalogies.aop.*.set*(..))")
	public void setterPoint() {}
	
	//combine getter and setter
	@Pointcut("getAllPoint() && !(getterPoint()||setterPoint())")
	public void getAllButNotGetorSetPoint() {}
	
	//logging aspect
	//call before aspect
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.canalogies.aop.AccountDAO.addAccount())")
	//@Before("execution(public void add*())")
	//@Before("execution(* add*())")
	//@Before("execution(* add*(com.canalogies.aop.Account))")
	//@Before("execution(* add*(..))")
	//@Before("getAllPoint()")
	
	@Before("getAllButNotGetorSetPoint()")
	public void beforeAddAccountAdvice() {
		System.out.println("=========> called before Add account");
	}
	
	@Before("getAllButNotGetorSetPoint()")
	public void beforeAddAccountAdvice1() {
		System.out.println("=========> called before Add account1");
	}
}
