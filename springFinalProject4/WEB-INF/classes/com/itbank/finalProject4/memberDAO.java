package com.itbank.finalProject4;

//import java.util.List;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class memberDAO implements memberInter{

	@Autowired
	SqlSessionTemplate my;

	@Override
	public void insert(memberDTO memberDTO) {
		
	}

	@Override
	public int login(memberDTO memberDTO) {
		return 0;
	}
	
	
	

}
