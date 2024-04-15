package com.ict.ex01;

public class Service {
	//OracleDAO oracleDAO = new OracleDAO();
	//MariaDBDAO mariaDBDAO = new MariaDBDAO();
	// 사용하고 싶은 메서드
	
	// 인터페이스(클래스)를 자료형으로 사용한 필드값
	private DAO dao;
	
	public Service() {}
	public Service(DAO dao) {
		this.dao = dao;
	}
	
	public void biz() {
		// OracleDAO, MariaDBDAO => prn() 실행
		// oracleDAO.prn();
		dao.prn();
	}
	public void setDao(DAO dao) {
		this.dao = dao;
	}
}
