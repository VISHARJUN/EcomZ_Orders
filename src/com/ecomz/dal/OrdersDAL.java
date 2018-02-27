package com.ecomz.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OrdersDAL {
	public static Connection getConnectionToDatabase(boolean localDBServer) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		try {
			if(localDBServer){
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			}
			else
			{
				connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.210:1521:orcl", "hr", "hr");
			}
		} catch (SQLException sqlException) {
			System.err.println("OrdersDAL:getConnectionToDatabase():" + sqlException);
		}
		return connection;
	}

	public static int insertRow(String insertQuery) {
		System.out.println("OrdersDAL:insertRow(String insertQuery):" + insertQuery);
		Statement insertStatement = null;
		int noOfRowsInserted = 0;
		try {
			insertStatement = getConnectionToDatabase(true).createStatement();
			noOfRowsInserted = insertStatement.executeUpdate(insertQuery);
			return noOfRowsInserted;
		} catch (SQLException sqlException) {
			System.err.println("OrdersDAL:insertRow(String insertQuery):" + sqlException);
			return noOfRowsInserted;
		}
	}
	public static int updateRow(String updateQuery) {
		System.out.println("OrdersDAL:updateRow(String updateQuery):" + updateQuery);
		Statement updateStatement = null;
		int noOfRowsUpdated = 0;
		try {
			updateStatement = getConnectionToDatabase(true).createStatement();
			noOfRowsUpdated = updateStatement.executeUpdate(updateQuery);
			return noOfRowsUpdated;
		} catch (SQLException sqlException) {
			System.err.println("OrdersDAL:updateRow(String updateQuery):" + sqlException);
			return noOfRowsUpdated;
		}
	}
	public static int deleteRow(String deleteQuery) {
		System.out.println("OrdersDAL:deleteRow(String deleteQuery):" + deleteQuery);
		Statement deleteStatement = null;
		int noOfRowsdeleted = 0;
		try {
			deleteStatement = getConnectionToDatabase(true).createStatement();
			noOfRowsdeleted = deleteStatement.executeUpdate(deleteQuery);
			return noOfRowsdeleted;
		} catch (SQLException sqlException) {
			System.err.println("OrdersDAL:deleteRow(String deleteQuery):" + sqlException);
			return noOfRowsdeleted;
		}
	}
}
