package comm.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {
    private static DataSource dataSourceObj=null;
    private static Connection connectionObj = null;
    public static Connection getConnectionInstance()
    {
    	try {
			Context context = new InitialContext();
			Object lookUpObj = context.lookup("java:/comp/env/jdbc/mysql");
			dataSourceObj=(javax.sql.DataSource)lookUpObj;
			
			connectionObj= dataSourceObj.getConnection();
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return connectionObj;
    }
}
