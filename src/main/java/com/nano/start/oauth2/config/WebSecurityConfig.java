package com.nano.start.oauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.anonymous()
		    .and()
		    .authorizeRequests().antMatchers("/api/test2").permitAll()
		    .and().authorizeRequests().anyRequest().authenticated();
	}
}
