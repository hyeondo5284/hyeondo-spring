package org.hyeondo.book.chap03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		
		/*
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService(memberDao);
		*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);
		
		RegisterRequest req = new RegisterRequest();
		req.setEmail("hyeondo5284@daum.net");
		req.setPassword("1234");
		req.setName("hyeondo");

		regService.regist(req);
	}
}