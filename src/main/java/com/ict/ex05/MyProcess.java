package com.ict.ex05;

import org.springframework.stereotype.Component;

@Component("mp")
public class MyProcess {
	private String name = "홍길동";
	private int age = 13;
	
	public MyProcess() {
		System.out.println("기본 생성자 동작");
	}

	public MyProcess(String name, int age) {
		System.out.println("필드값 생성자 동작");
		this.name = name;
		this.age = age;
	}
	public void prn() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
