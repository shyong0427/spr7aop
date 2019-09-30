package aop1;

public class MyAspect {	// 핵심 메소드에 인터셉트 걸고 아래 사항 수행
	public void myLogin() {
		System.out.println("핵심 메소드 수행 전 로그인 작업 수행");
	}
	
	public void myLogging() {
		System.out.println("핵심 메소드 수행 중...");
	}
	
	public void myLogout() {
		System.out.println("핵심 메소드 수행 후 로그아웃 처리");
	}
}