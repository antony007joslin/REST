package com.restful.webservice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Book {

	public static String out(){
		Connection con = DBConnection.getConnect();
		Statement st = null;
		ResultSet rs = null;
		String js = "JSON";
		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT array_to_json(array_agg(books)) FROM books");
			while(rs.next())
			{
				js = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return js;
	}
	
}
