package com.kdy.util;

public class BoardMainTest {

	public static void main(String[] args) {
		
		DBConnector db = new DBConnector();
		
		try {
			db.getConnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
