package aop3;

public class LogicImpl implements LogicInter {
	private ArticleInter articleInter;
	
	public LogicImpl() {
	}

	public LogicImpl(ArticleInter articleInter) {
		this.articleInter = articleInter;
	}
	
	public void selectdataProcess() { // 오버라이딩
		System.out.println("selectdataProcess 수행 시작");
		
		articleInter.selectAll();
		
		System.out.println("selectdataProcess 수행 완료");
	}
}