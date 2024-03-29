package aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		String[] configs = new String[] {"init_bean.xml"};
		String[] configs = new String[] {"init_bean.xml", "init_aop.xml"};
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configs);
		
		WriteInter writeInter = (WriteInter)context.getBean("writeInterImpl");
		writeInter.write();
		
		System.out.println();
		
		HelloInter helloInter = context.getBean("helloInterImpl", HelloInter.class);
		helloInter.hello();
		helloInter.process();
	}
}