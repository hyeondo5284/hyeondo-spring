package org.hyeondo.book.chap03ex;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
		ArticleService articleService = ctx.getBean("articleService", org.hyeondo.book.chap03ex.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService", org.hyeondo.book.chap03ex.MemberService.class);

		articleService.addArticle();
		memberService.registerMember();

		ctx.close();
	}

}