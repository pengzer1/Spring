package com.test.spring.di02;

public class Hong {
	
	// 의존 주입 구현
	// 1. 의존 객체 > 멤버 변수 만들기
	// 2. 의존 주입 도구 만들기 > 생성자 or Setter
	
	private Pen p;
	
	public Hong(Pen p) {
		this.p = p;
	}

	public void run() {
		
		// 의존 관계
		// Main > Hong > (의존) > Pen
		
		// 펜을 사용하는 업무 > 펜 객체 생성 > 사용(위임)

		// Hong의 의존 객체이다. > Pen을 직접 생성한다.(기존 방식)
		Pen p = new Pen();
		p.write();
		
	}

}
