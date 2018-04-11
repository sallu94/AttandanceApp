package com.attendancemgmt.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// @Autowired
	// private DetailService userDetailService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// auth.userDetailsService(userDetailService).passwordEncoder(User.encode);

		auth.inMemoryAuthentication().withUser("saurav").password("{noop}saurav").roles("USER");
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/**").hasRole("ADMIN").anyRequest().authenticated().and().formLogin()
				.loginPage("/loginGet").loginProcessingUrl("/validate").permitAll().and().logout().permitAll().and()
				.exceptionHandling().accessDeniedPage("/accessDenied");
	}


}
