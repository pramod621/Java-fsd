package com.ecommerce;

import java.sql.*;
public class DBConnection {

	public static void main(String[] args) {
		try
		{
		//Registering Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Making Connection 
		Connection  conObj  = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Sandeephn123!");

		if(conObj!=null)
			System.out.println("Connected.....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

	public void closeConnection() {
		// TODO Auto-generated method stub
		
	}

}