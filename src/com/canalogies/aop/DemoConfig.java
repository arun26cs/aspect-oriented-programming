package com.canalogies.aop;

 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import jdk.jfr.Experimental;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.canalogies.aop")
public class DemoConfig {

	
}
