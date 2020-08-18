package com.canalogies.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointcutAspects {
	//this class is the set of expressions only
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
}
