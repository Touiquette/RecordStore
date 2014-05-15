/**
 * 
 */
package javalabrecords;

import static javalabrecords.Table.PASS;
import static javalabrecords.Table.USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class TableCreator extends Table {

	protected static void dbCreateTable(String tableName, String tableColumns) {

		Statement statement = null;
		Connection conn = null;

		try {
			Class.forName(driver); // Instantiate a driver object
			conn = DriverManager.getConnection(protocol + dbName
					+ ";create=true", USER, PASS);
			statement = conn.createStatement();
			// Create a table in the database
			String createTableSQL = ("CREATE TABLE " + tableName
					+ " (KeyID int, Created TimeStamp," + USER
					+ " varchar(12), " + tableColumns);

			try {
				statement.executeUpdate(createTableSQL);
			} catch (SQLException sqle) {
				System.out.println("Error creating table" + tableName
						+ ",\n see exception for detail " + sqle);

				String dropTableSQL = ("DROP TABLE" + tableName);
				statement.execute(dropTableSQL);
				statement.executeUpdate(createTableSQL);
			}

			System.out.println("Created " + tableName + " table");
			// Add some data
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			String strDate = (dateFormat.format(date));
			String addDataSQL = ("INSERT INTO Records VALUES (-1, " + strDate
					+ ", " + USER);
			statement.executeUpdate(addDataSQL);
			addDataSQL = ("INSERT INTO Records VALUES (0, " + strDate + ", " + USER);
			statement.executeUpdate(addDataSQL);
			System.out.println("Added two rows of null data to table "
					+ tableName);
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// A finally block runs whether an exception is thrown or not. Close
			// resources and tidy up whether this code worked or not.
			try {
				if (statement != null) {
					statement.close();
					System.out.println("Statement closed");
				}
			} catch (SQLException se) {
				// Closing the connection could throw an exception too
				se.printStackTrace();
			}
			try {
				if (conn != null) {
					conn.close(); // Close connection to database
					System.out.println("Database connection closed");
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("End of program");
	}
}