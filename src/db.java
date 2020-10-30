import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class db {

	public static Connection con;

	public static Connection get() throws SQLException {

		Connection conn = null;

		try {

			String id = "sys as sysdba";

			String pw = "1234";

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";

			// JDBC �뱶�씪�씠踰꾨�� 濡쒕뵫�븯�뒗 肄붾diddydtjr12

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, id, pw);

			System.out.println("�뜲�씠�꽣踰좎씠�뒪�뿉 �뿰寃곕릱�떎\n");

		} catch (ClassNotFoundException c) {

			System.out.println("濡쒕뵫 �떎�뙣");

		} catch (SQLException s) {

			System.out.println("�뜲�씠�꽣踰좎씠�뒪 �젒�냽 �떎�뙣");

		}

		return conn;

	}

}