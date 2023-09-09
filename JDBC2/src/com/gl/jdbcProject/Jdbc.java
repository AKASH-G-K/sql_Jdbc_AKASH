package com.gl.jdbcProject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc {
	String url="jdbc:mysql://localhost:3306/jdbc_demo2";
	String username="root";
	String password="akashgkgkmysql";
	public  void insert() {
		
	
		String query = "insert into employee values(1,'sridhar','sridhar@gl.com',1236549871)";
		String query2 = "insert into employee values(2,'vishnu','vishnu@gl.com',1236549541)";
		String query3 = "insert into employee values(3,'harshit','harshit@gl.com',1566549871)";
		String query4 = "insert into employee values(4,'akash','akash@gl.com',456549871)";
		String query5 = "insert into employee values(5,'sudar','sudar.gl.com',1546549871)";
		try {
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connecting to Database");
			Statement st=con.createStatement();
			int rows =st.executeUpdate(query);
			int row2 =st.executeUpdate(query2);
			int row3 =st.executeUpdate(query3);
			int row4 =st.executeUpdate(query4);
			int row5 =st.executeUpdate(query5);
			System.out.println("No of Rows Get Affected : "+(rows+row2+row3+row4+row5));
			System.out.println("Excecuted Success Fully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public  void Modify() {
	
       
        String querry="alter table employee modify Email_Id varchar(30) not null";
        
        try {
			Connection con =DriverManager.getConnection(url,username,password);
			System.out.println("connection to database");
			Statement st=con.createStatement();
			int row=st.executeUpdate(querry);
			System.out.println("no of table change"+row);
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
	}
	
	public  void update() {
		
        String querry="update employee set Name='Karthik' where Id=3";
        String querry2="update employee set Email_Id='Karthik@gl' where Id=3";
        try {
			Connection con =DriverManager.getConnection(url,username,password);
			System.out.println("connection to database");
			Statement st=con.createStatement();
			int row=st.executeUpdate(querry);
			int row1=st.executeUpdate(querry2);
			System.out.println("Rename Has Been Done for thr table "+(row+row1));
			con.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  void delete() {

		String query="delete from employee where Id=3";
		String query1="delete from employee where Id=4";
		try {
			Connection con =DriverManager.getConnection(url,username,password);
			System.out.println("connection to database");
			
			Statement st=con.createStatement();
			int rows=st.executeUpdate(query);
			int row1=st.executeUpdate(query1);
			System.out.println("No Of Rows Get Affected : "+(rows+row1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void droprecord() {
	
		String query="truncate employee";
		try {
			Connection con =DriverManager.getConnection(url,username,password);
			System.out.println("connection to database");
			Statement st=con.createStatement();
			int rows =st.executeUpdate(query);
			System.out.println("Rows get Affected : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
