package org.hyeondo.book.chap04;

import org.hyeondo.book.chap03.RegisterRequest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMainUsingComponentScan {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap04.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService", MemberRegisterService.class);
		
		RegisterRequest req = new RegisterRequest();
		req.setEmail("hyeondo5284@daum.net");
		req.setPassword("5482");
		req.setName("hyeondo");
		
		regService.regist(req);
		ctx.close();
	}
}
