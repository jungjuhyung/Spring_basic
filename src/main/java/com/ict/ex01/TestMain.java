package com.ict.ex01;

public class TestMain {
	public static void main(String[] args) {
		// 1. 일반적인 객체 생성해서 호출
		Service service = new Service();
		service.biz();
		
		// 생성자로 인터페이스를 상속받은 객체를 dao변수에 넣기
		Service service2 = new Service(new OracleDAO());
		service2.biz();
		
		// setter로 인터페이스를 상속받은 객체를 dao변수에 넣기
		Service service3 = new Service(new OracleDAO());
		service3.setDao(new MariaDBDAO());
		service.biz();
		
		
	}
}
