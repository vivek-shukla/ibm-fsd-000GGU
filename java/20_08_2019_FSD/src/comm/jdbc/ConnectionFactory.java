package comm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
       private static Connection connection;
       private static ConnectionFactory connectionInstance = null;
       private ConnectionFactory() throws SQLException 
       {   
    	   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibmfsd","root","Vivek@1997");
       }
       public static ConnectionFactory createObject() throws SQLException
       {  
    	   if(connectionInstance==null)
    	   {
    		   connectionInstance = new ConnectionFactory();
    	   }
    	   return connectionInstance;
    	   
       }
       
       public static Connection getConnection()
       {
    	   return connection;
       }
}
