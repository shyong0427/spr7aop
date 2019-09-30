package aop3;

import org.aspectj.lang.ProceedingJoinPoint;

public class OurAspect { // Advice 클래스
	public Object kbs(ProceedingJoinPoint joinPoint) throws Throwable {
		// 핵심 메소드 이름 얻기
		String mname = joinPoint.getSignature().toString();
		
		System.out.println("핵심 메소드 " + mname + " 시작 전 작업...");
		Object object = joinPoint.proceed();
		System.out.println("핵심 메소드 " + mname + " 시작 전 끝...");
		
		return object;
	}
}