package com.ict.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// DI는 Spring Container에서 객체(Bean) 생성하고 관리한다.
		// Spring Container에게 필요한 정보를 제공해야 한다. => Configurationg MetaData(설정 정보)필요
		// Configurationg MetaData => 기본적으로 XML파일 형태이다. 추가적으로 Annotation을 이용한다.
		//							  ** Spring boot에서는 무조건 Annotation 사용
		
		// Spring Container => BeanFatory => ApplicationContext => 일반적으로 사용
		//								  => WebApplicationContext(Web) => 웹에서 사용
		// 										이 두개의 객체인터페이스를 사용할 수 있다.
		
		// ApplicationContext 생성 방법 => 3번째 spring.framework 라이브러리를 사용해야한다.
		// ApplicationContext context = 
		// 		new GenericXmlApplicationContext("패키지 경로 포함 설정정보 파일명.xml");
		
		// 설정 정보 생성 방법
		// new -> spring bean Configurationg file로 생성하면 자동으로 탬플릿이 생성된다.
		ApplicationContext context = 
		 		new GenericXmlApplicationContext("com/ict/ex02/config.xml");
		
		// context객체에서 사용할 객체 꺼내오기
		// 이때 이미 생성된 객체를 꺼내오기 때문에 반환형이 Object형으로 나온다. 그래서 반환형을 형변환해줘야한다.
		// 꺼내오는자료형 변수명 = (꺼내오는자료형 변수명) context.getBean("꺼내올 bean ID");
		Service service = (Service) context.getBean("service");
		service.biz();
		
	}
}
