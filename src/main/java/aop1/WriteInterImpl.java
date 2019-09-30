package aop1;

public class WriteInterImpl implements WriteInter{
	public WriteInterImpl() {
		System.out.println("WriteInterImpl 생성자 생성");
	}
	
	public void write() { //write override
		try {
			Thread.sleep(3000);
			System.out.println("3초 지연 중...");
			System.out.println("write 수행");
		} catch (Exception e) {
		}
	}
}