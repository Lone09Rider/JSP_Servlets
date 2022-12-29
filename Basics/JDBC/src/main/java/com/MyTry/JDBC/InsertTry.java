package com.MyTry.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTry {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet set = null;
		
		String url = "jdbc:mysql://localhost:3306/enterprise_java";
		String user = "root";
		String password = "123456";
		
		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
			String query = "Insert into student(sname, sage, saddr) values('Mamata', 48, 'Cuttack, Odisha')";
			int count = statement.executeUpdate(query);
			System.out.println(count + " row Inserted");
			
//			String delQuery = "delete from student where sid=2";
//			int numDeleted = statement.executeUpdate(delQuery);
//
//			System.out.println("Number of rows deleted : " + numDeleted);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			String query = "SELECT * FROM STUDENT";
			set = statement.executeQuery(query);
			
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				int age = set.getInt(3);
				String addr = set.getString(4);

				System.out.println(id + ", " + name + ", " + age + ", '" + addr + "'");
			}
		}
		
	}

}
