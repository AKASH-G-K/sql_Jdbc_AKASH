package com.gl.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MYConnections {
Connection con;
String user="root";
String password ="akashgkgkmysql";
String url="jdbc:mysql://localhost:3306/jdbc_demo2";
	public Connection getMyConnection() {
		
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
}
