package com.fsd._09_2019_annotationAndXML.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("movie")
public class Movie {
  @Value("1")
  int id;
  @Value("Children of Men,Roma")
  String name;
  @Autowired
  Director directedBy;
 	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Director getDirectedBy() {
		return directedBy;
	}
	public void setDirectedBy(Director directedBy) {
		this.directedBy = directedBy;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", directedBy=" + directedBy.getName() + "]";
	}
 
  
}


//public class EmployeeDAO {
//	
//	
//	private DataSource dataSource;
//	
//	
//	public DataSource getDataSource() {
//		return dataSource;
//	}
//
//
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
//
//
//	/*
//	 * public void createConnection() { try { Connection
//	 * connection=dataSource.getConnection();
//	 * System.out.println(connection.toString()); } catch (SQLException e) { // TODO
//	 * Auto-generated catch block e.printStackTrace(); } }
//	 */
//	
//	public void createEmployee(Employee employee)
//	{
//		try {
//			Connection connection=dataSource.getConnection();
//			PreparedStatement pst=connection.prepareStatement("insert into employee(name) values(?)");
//			pst.setString(1, employee.getName());
//			pst.executeUpdate();
//			System.out.println("inseerted..!");
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
