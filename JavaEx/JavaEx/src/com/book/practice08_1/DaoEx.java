package com.book.practice08_1;

public class DaoEx {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
	}

}
