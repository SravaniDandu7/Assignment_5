package com.java.Department;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	//the database server credentials are required
	private static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL="jdbc:mysql://localhost:3306/departments";
	private static final String DATABASE_USERNAME="root";
	private static final String DATABASE_PASSWORD="root";
	
	public static Connection getDBConnection()
	{
		Connection connection = null;
		try {
			
			//step1:Load the Driver
			Class.forName(DRIVER_NAME);
			
			//step2:create connection
			connection  = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
		
		
	}
	
}

