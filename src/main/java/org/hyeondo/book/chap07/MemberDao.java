package org.hyeondo.book.chap07;

import java.util.List;

import org.hyeondo.book.chap03.Member;

public interface MemberDao {
	Member selectByEmail(String email);
	
	void insert(Member member);
	
	void update(Member member);
	
	List<Member> selectAll(int offset, int count);
}
