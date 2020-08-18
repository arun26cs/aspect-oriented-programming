package com.canalogies.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Aspect
@Component

public class MyAspectNew2 {

	
	//this is the set of aspect in relate to one aspect i.e securoity or dao or logger
	//@Before("getAllButNotGetorSetPoint()")--> you cannot put like this since expression is string and blatantly go and check that finction in classpath and cant find as it would be insidesone class only
	@Before("com.canalogies.aop.aspects.MyPointcutAspects.getAllButNotGetorSetPoint()")
	public void beforeAddAccountAdvice1(JoinPoint theJoinPoint) {
		System.out.println("=========> called before as security account1"); 
		MethodSignature theMethoSignature = (MethodSignature) theJoinPoint.getSignature();
		Object[] theargs = theJoinPoint.getArgs();
		for(Object a:theargs) {
			if(a instanceof Account) {
				System.out.println(((Account) a).getName());
			}else {
				System.out.println(a);
			}
			
			
		}
		System.out.println(theMethoSignature+" "+theMethoSignature);
	}
	
}
