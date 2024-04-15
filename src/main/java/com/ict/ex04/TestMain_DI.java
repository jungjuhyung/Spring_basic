package com.ict.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain_DI {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("com/ict/ex04/config.xml");
		
		Myprocess mp1 = (Myprocess) context.getBean("mp1");
		mp1.prn();
		
		Myprocess mp2 = (Myprocess) context.getBean("mp2");
		mp2.prn();
	}
}
