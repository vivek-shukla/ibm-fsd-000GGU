package com.example.FSD_13_09_2019_Employee_Inheritance;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfigureClass extends WebSecurityConfigurerAdapter {
  
	@Override
	protected  void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		@SuppressWarnings("deprecation")
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(users.username("vivek").password("vivek123").roles("employee"))
		.withUser(users.username("becky").password("becky123").roles("admin"));
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/").hasAnyRole("employee","admin").antMatchers("/h2-console/**").permitAll().anyRequest().authenticated().and().formLogin().and().logout().permitAll();
		http.csrf().disable();
        http.headers().frameOptions().disable();
	}
	
}
