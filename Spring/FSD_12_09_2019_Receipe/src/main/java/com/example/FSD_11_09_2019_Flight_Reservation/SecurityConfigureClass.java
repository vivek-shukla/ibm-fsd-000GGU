package com.example.FSD_11_09_2019_Flight_Reservation;

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
		.withUser(users.username("vivek").password("vivek123").roles("user"))
		.withUser(users.username("becky").password("becky123").roles("user","chef"))
		.withUser(users.username("jose").password("jose123").roles("user","admin"));
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/").hasAnyRole("user","chef","admin").antMatchers("/receipe/view**").hasRole("chef").antMatchers("/receipe/save/**").hasRole("admin").anyRequest().authenticated().and().formLogin().loginPage("/loginPage").loginProcessingUrl("/authenticateUser").permitAll();
	}
	
}
