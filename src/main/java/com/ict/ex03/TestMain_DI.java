package com.ict.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain_DI {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("com/ict/ex03/config.xml");
		
		MyProcess mp1 = (MyProcess) context.getBean("mp1");
		mp1.prn();
		MyProcess mp2 = (MyProcess) context.getBean("mp2");
		mp2.prn();
		MyProcess mp3 = (MyProcess) context.getBean("mp3");
		mp3.prn();
		
	}
}
