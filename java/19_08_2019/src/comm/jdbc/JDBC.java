package comm.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC { 
	public static void main(String[] args) throws SQLException 
	{
        ConnectionFactory factory= ConnectionFactory.createConnection();
		
		Scanner scanner = new Scanner(System.in);
		Connection connection= factory.getConnection();
		
		PreparedStatement pst=connection.prepareStatement("insert into department values(?,?)");
		System.out.print("Department ID: ");
		int id=scanner.nextInt();
		System.out.print("Department name: ");
		String name=scanner.next();
		pst.setInt(1, id);
		pst.setString(2, name);
		int count=pst.executeUpdate();
		System.out.println(count+" row(s) updated");
		pst = connection.prepareStatement("select * from department");
		ResultSet resultSet = pst.executeQuery();
		System.out.println("id\t department");
		while(resultSet.next())
		{
			System.out.printf("%d\t %s \n",resultSet.getInt(1),resultSet.getString(2));
		}
		
		
	}

}
