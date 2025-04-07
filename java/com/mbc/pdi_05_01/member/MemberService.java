package com.mbc.pdi_05_01.member;

import java.util.ArrayList;

public interface MemberService {

	int idcheck(String id);

	void memberinsert(String id, String pw, String name, int age);

	ArrayList<MemberDTO> memberselect();
	
}
