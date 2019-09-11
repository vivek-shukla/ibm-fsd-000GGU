package com.customer.config;

import java.beans.PropertyVetoException;

import java.util.Properties;



import javax.sql.DataSource;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.customer")
public class ConfigClass implements WebMvcConfigurer {

	@Bean
	public DataSource dataSource()
	{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("Vivek@1997");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/hibernatefsd");
		try {
			dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dataSource.setMaxPoolSize(20);
		dataSource.setMinPoolSize(10);
		dataSource.setMaxIdleTime(30000);
		return dataSource;
	}
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{   
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan("com.customer");
		sessionFactory.setHibernateProperties(getProperty());
		return sessionFactory;
		
	}
	private Properties getProperty() {
		Properties props = new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.put("hibernate.show_sql", "true");
		return props;
	}
	@Bean
	@Autowired
	public HibernateTransactionManager txManager(SessionFactory sessionFactory)
	{   
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		return txManager;
		
	}
}
