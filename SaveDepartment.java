package com.java.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.patientRecords.DatabaseConnection;

public class SaveDepartment {

	public static void main(String[] args, PreparedStatement preparedStatement) throws SQLException{
		
		Connection connection = null;
		
		try {
			

			connection = DatabaseConnection.getDBConnection();
			
			
			//string query for insert
			
			String query = "insert into department(department_id,department_name) values (?,?)";
		    
			Department department_obj = new Department(); 
			
			preparedStatement.setInt(1,department_obj.getDepartment_id());
			
			preparedStatement.setString(2, department_obj.getDepartment_name());
			
			//query statement object
			PreparedStatement prepareStatement  = connection.prepareStatement("insert into Department(?,?)");
			
			
			//execute query statement
			int status = prepareStatement.executeUpdate(query);
			System.out.println(status+"employee object stored in the database table");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			connection.close();
		}
	}
}
