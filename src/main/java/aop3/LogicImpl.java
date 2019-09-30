package aop3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("jhe")
public class LogicImpl implements LogicInter {
	@Autowired
	@Qualifier("articleDao")
	private ArticleInter articleInter;

	public void selectdataProcess() { // 오버라이딩
		System.out.println("selectdataProcess 수행 시작");
		
		articleInter.selectAll();
		
		System.out.println("selectdataProcess 수행 완료");
	}
}