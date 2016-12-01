package com.restful.webservice;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	static Connection con = null;
	 public static Connection getConnect() {
		 try {
			 Class.forName("org.postgresql.Driver");
			 con = DriverManager.getConnection(
					 "jdbc:postgresql://localhost:5432/library", "postgres", "pgadmin123");
	 }
	 catch(Exception e)
	 {
	  System.out.println("DBConnection Exception " + e);
	 }
	 return con;
	 }
}