package aop1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	private MyAspect myAspect;
	
	public void setMyAspect(MyAspect myAspect) {
		this.myAspect = myAspect;
	}
	
	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
		Object object = null;
	
		myAspect.myLogin();
		object = joinPoint.proceed(); // 지정된 핵심메소드 수행
		myAspect.myLogout();
		
		return object;
	}
}