package com.test.persistence;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;


// 1. Junit
// 2. Log4j


@Log4j
public class JDBCTest {

	@Test
	public void testConnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "java1234");
			
			assertNotNull(conn);
			
			log.info(conn.isClosed());
			log.warn("경고 메시지");
			log.error("에러 메시지");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
