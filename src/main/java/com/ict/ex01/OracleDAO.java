package com.ict.ex01;

public class OracleDAO implements DAO {
	public OracleDAO() {
		System.out.println("OracleDAO 생성자");
	}
	
	@Override
	public void prn() {
		System.out.println("OracleDAO prn 메서드 실행");
	}
}
