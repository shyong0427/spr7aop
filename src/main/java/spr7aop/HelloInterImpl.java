package spr7aop;

public class HelloInterImpl implements HelloInter {
	public HelloInterImpl() {
		System.out.println("HelloInterImpl 생성자 생성");
	}
	
	public void hello() {
		System.out.println("HelloInterImpl : hello() 처리");
	}

	public void process() {
		System.out.println("HelloInterImpl : process() 수행");
	}
}