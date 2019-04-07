package org.hyeondo.book.chap07;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMainUsingSpring {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap07.xml");
		MemberService memberService = ctx.getBean(MemberService.class);
		memberService.insertMember();
		//memberService.updateMember();
		memberService.selectAll();
		ctx.close();
	}
}
