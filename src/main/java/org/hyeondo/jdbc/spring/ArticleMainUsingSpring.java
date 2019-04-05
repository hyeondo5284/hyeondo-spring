package org.hyeondo.jdbc.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMainUsingSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-jdbc.xml");
		ArticleService articleService = context.getBean("articleService",
				ArticleService.class);
		context.close();

		//articleService.addArticle();
		articleService.listArticles();
	}

}