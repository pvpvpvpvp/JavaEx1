package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";// 로컬호스트 본인컴퓨터~ 포트 1521 sid(I) XE
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
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.print("검색할 급여범위를 입력해주세요 예시 2000 10000 이면 2000~10000 검색됨 :>");
				int scsal = 0;
				int scsal1 = 0;
				try {
					scsal = sc.nextInt();
					scsal1 = sc.nextInt();
				} catch (Exception e) {
					System.out.println("숫자만 입력해주세요");
					// TODO: handle exception
				}
				String sql = "SELECT first_name|| ' ' || last_name name, salary " + "FROM employees "
						+ "WHERE salary BETWEEN " + scsal + " AND " + scsal1 + " ORDER BY salary";
				re = stmt.executeQuery(sql);

				while (re.next()) {
					String deptId = re.getString("name");
					int deptName = re.getInt("salary");
					System.out.println(deptId + "  " + deptName);
				}
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
