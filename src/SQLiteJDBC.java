import java.sql.*;

public class SQLiteJDBC {
//	This is an SQLite Java DataBase Connection

	/**
	 * https://www.tutorialspoint.com/sqlite/sqlite_java.htm
	 * @return
	 */

	public static int addNewData() {

		Connection dbc = null;

		try {
			Class.forName("org.sqlite.JDBC");
			dbc = DriverManager.getConnection("jdbc:sqlite:test.db");
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}


		return 0;
	}
}