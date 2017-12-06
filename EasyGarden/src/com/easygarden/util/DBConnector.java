package com.easygarden.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class DBConnector {

	public static Connection connectToDB(String szDBHost, String szDBName, String szDBUser, String szDBPassword) {

		Connection conn = null;
		String databaseURL = "jdbc:mysql://" + szDBHost + ":3306/" + szDBName + "?user=" + szDBUser + "&password="
				+ szDBPassword + "";
		try {
			conn = (Connection) DriverManager.getConnection(databaseURL);
			if (conn != null) {
				System.out.println("You're now connected to "+szDBName);
			}
		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user,host,password or dbName is invalid" + ex);
		}/*finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		} */
		return conn;
	}

}
