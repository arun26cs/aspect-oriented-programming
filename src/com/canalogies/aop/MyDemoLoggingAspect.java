package com.canalogies.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(2)
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
	//@Before("getAllPoint()")
	
	@Before("com.canalogies.aop.aspects.MyPointcutAspects.getAllButNotGetorSetPoint()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("=========> called before as log aspect account");
		MethodSignature theMethoSignature = (MethodSignature) theJoinPoint.getSignature();
		System.out.println(theMethoSignature+" "+theMethoSignature);
		
	}
	
	
}
