package com.itbank.finalProject4;

public interface memberInter {
	//구현할 기능에 대해서만 정의
	//1. 회원가입
	void insert(memberDTO memberDTO);
		
	//2. 로그인처리
	int login(memberDTO memberDTO);
	
	 
}
