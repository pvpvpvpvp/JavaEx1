package com.javaex.jdbc;

import java.sql.*;

public class ConnectionText {

	public static void main(String[] args) {
		
		String dbur1 ="jdbc:oracle:thin:@localhost:1521:xe";// 로컬호스트 본인컴퓨터~ 포트 1521 sid(I) XE
//		String dbuser = "C##BITUSER";
//		String dbpass = "bituser";
		
		String dbpass = "hr";
		String dbuser = "hr";
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			System.out.println(conn);
			System.out.println("접속성공!");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.err.println("드라이버로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		// TODO Auto-generated method stub

	}

}
