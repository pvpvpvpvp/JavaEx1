package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";// 로컬호스트 본인컴퓨터~ 포트 1521 sid(I) XE
//		String dbuser = "C##BITUSER";
//		String dbpass = "bituser";

		String dbpass = "hr";
		String dbuser = "hr";
		Statement stmt = null;
		ResultSet re = null;
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			System.out.println(conn);
			System.out.println("접속성공!");
			stmt = conn.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 이름 혹은 성을 입력해주세요 :>");
			String scc = sc.next();
			
			String sql = "SELECT first_name|| ' ' || last_name name, email, hire_date "
					+ "FROM employees "
					+ "WHERE first_name LIKE '%"+scc+"%'"
							+ "OR last_name LIKE '%"+scc+"%'";
			re = stmt.executeQuery(sql);

			while (re.next()) {
				String deptId = re.getString("name");
				String deptName = re.getNString("email");
				String date = re.getString("hire_date");
				System.out.println(deptId + "  " + deptName + " " + date);
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
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		// TODO Auto-generated method stub

	}

}
