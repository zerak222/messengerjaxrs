package org.jdbc.demo.myjdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String args[]) {

		try {
			System.out.println("Start-------------------------------------------");
			Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=ExperimentDb", "ExperimentDb", "ExperimentDb"); 
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
			System.out.println("END-------------------------------------------");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
