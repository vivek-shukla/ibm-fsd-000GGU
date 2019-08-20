package comm.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory{
	private static Connection connection;
	private static ConnectionFactory connectionFactoryInstance=null;
	private ConnectionFactory()throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ibmfsd","root","Vivek@1997");
	}
	
	
	public static ConnectionFactory createConnection() throws SQLException
	{
		if(connectionFactoryInstance==null)
		{
			connectionFactoryInstance=new ConnectionFactory();
		}
		return connectionFactoryInstance;
	}
	public Connection getConnection()throws SQLException
	{
		return connection;
	}
	
}
