package aop3;

import org.springframework.stereotype.Repository;

// DB와 연결해서 DB처리
// @Component
@Repository
public class ArticleDao implements ArticleInter {
	public void selectAll() {
		System.out.println("DB 자료 읽기...");
	}
}