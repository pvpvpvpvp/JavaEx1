package com.javaex.jdbc;

import java.sql.*;

public class SelectText {

	public static void main(String[] args) {
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";// 로컬호스트 본인컴퓨터~ 포트 1521 sid(I) XE
//		String dbuser = "C##BITUSER";
//		String dbpass = "bituser";

		String dbpass = "hr";
		String dbuser = "hr";
		Connection conn = null;
		Statement stmt = null;
		ResultSet re = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			System.out.println(conn);
			System.out.println("접속성공!");

			stmt = conn.createStatement();
			String sql = "SELECT department_id, department_name FROM departments ORDER BY department_id";
			re = stmt.executeQuery(sql);
			System.out.println(re);
			
			while(re.next()) {
				int deptId =re.getInt(1);
				String deptName = re.getNString("department_name");
				System.out.println(deptId+"  "+deptName);
			}

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.err.println("드라이버로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				conn.close();
				re.close();
				stmt.close();

			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		// TODO Auto-generated method stub

	}

}
