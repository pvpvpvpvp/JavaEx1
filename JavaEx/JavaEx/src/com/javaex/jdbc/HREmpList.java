package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

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
			String sql = "SELECT emp.first_name|| ' ' ||emp.last_name as name,\r\n"
					+ "					mgr.first_name|| ' ' ||mgr.last_name  mgr_name \r\n"
					+ "					FROM employees emp, employees mgr\r\n"
					+ "					WHERE emp.manager_id=mgr.employee_id\r\n"
					+ "					ORDER BY name DESC";
			re = stmt.executeQuery(sql);

			while (re.next()) {
				String deptId = re.getString("name");
				String deptName = re.getNString("mgr_name");
				System.out.println(deptId + "  " + deptName);
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
