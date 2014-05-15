/**
 * 
 */
package javalabrecords;

/**
 * @author Janis Froehlig Apr 29, 2014
 * 
 *         Initializes connection with the database. As an abstract class,
 *         requires specification of a table (session with a table)
 */
public abstract class Table {

	// JDBC driver name, protocol, used to create a connection to the DB
	private final String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	private final String protocol = "jdbc:derby:";
	private final String dbName = "JLR";
	// Database credentials - for embedded, usually defaults. A client-server DB
	// would need to authenticate connections
	private static final String USER;
	private static final String PASS;
	// TODO password encryption http://www.jasypt.org/easy-usage.html
}
http://docs.oracle.com/javadb/10.5.3.0/ref/crefjavstateautogen.html