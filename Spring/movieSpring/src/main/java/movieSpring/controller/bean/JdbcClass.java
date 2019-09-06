package movieSpring.controller.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component("jdbcClass")
public class JdbcClass extends JdbcTemplate {
	@Autowired
	DataSourceClass dataSource;
	
	
	@PostConstruct
	public void init()
	{
		this.setDataSource(dataSource);
	}

	public DataSourceClass getDataSource() {
		return dataSource;
	}



	public void setDataSource(DataSourceClass dataSource) {
		this.dataSource = dataSource;
	}


    
	public JdbcClass() {
		super();
		// TODO Auto-generated constructor stub
	}	

}
