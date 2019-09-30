package aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("init_bean2.xml");
		
		LogicInter logicInter = (LogicInter)context.getBean("logicImpl");
		logicInter.selectdataProcess();
	}
}