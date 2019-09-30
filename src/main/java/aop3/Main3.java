package aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("init_bean2.xml");
		
		LogicInter logicInter = (LogicInter)context.getBean("logicImpl");
		logicInter.selectdataProcess();
	}
}