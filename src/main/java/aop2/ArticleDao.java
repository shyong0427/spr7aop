package aop2;

public class ArticleDao implements ArticleInter {
	public void selectAll() {
		System.out.println("DB 자료 읽기...");
	}
}