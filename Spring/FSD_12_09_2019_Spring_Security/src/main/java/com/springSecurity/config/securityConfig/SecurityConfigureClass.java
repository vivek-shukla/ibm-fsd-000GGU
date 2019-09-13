package com.springSecurity.config.securityConfig;

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
		.withUser(users.username("vivek").password("vivek123").roles("student"))
		.withUser(users.username("becky").password("becky123").roles("student","teacher"))
		.withUser(users.username("jose").password("jose123").roles("student","admin"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/teacher/**").hasRole("teacher").antMatchers("/admin/**").hasRole("admin").anyRequest().authenticated().and().formLogin().loginPage("/loginPage").loginProcessingUrl("/authenticateUser").permitAll().and().logout().permitAll();
	}
	
	
}
