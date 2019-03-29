package org.hyeondo.book.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService(memberDao);

		RegisterRequest req = new RegisterRequest();
		req.setEmail("hyeondo5284@daum.net");
		req.setPassword("1234");
		req.setName("hyeondo");

		regService.regist(req);
	}
}