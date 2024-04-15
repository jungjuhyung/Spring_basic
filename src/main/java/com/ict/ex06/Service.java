package com.ict.ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	// 변수이름과 참조하는 클래스의 id가 같을 때 사용 @Autowired
	// 현재 상황 : 변수이름: dao, 참조하려는 클래스 id : oracleDAO, mariaDBDAO
	// 이름이 달라서 사용 못함
	// 같은 이름이 없을 때는 @Qualifier("id명") 참조하고자하는 클래스의 id를 입력합니다.
	
	@Autowired
	@Qualifier("oracleDAO")
	private DAO dao;
	
	public Service() {}
	public Service(DAO dao) {
		this.dao = dao;
	}
	
	public void biz() {
		dao.prn();
	}
	public void setDao(DAO dao) {
		this.dao = dao;
	}
}
