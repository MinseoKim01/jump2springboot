package com.mysite.sbb;

import lombok.Getter;
import lombok.Setter;

/* 
클래스 명 바로 위에 애너테이션 적용
애너테이션(annotation) : 사람도 읽고 프로그램도 이해하는 특별한 메
Getter, Setter 메서드를 따로 작성하지 않아도
SetHello, setLombok, getHello, getLombok 등의 메서드 사용 가
*/
@Getter
@Setter
public class HelloLombok {
	// hello, lombok 속성 추
	private String hello;
	private int lombok;
	
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok();
		helloLombok.setHello("헬로");
		helloLombok.setLombok(5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}
}
