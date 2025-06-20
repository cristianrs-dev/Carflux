package com.carflux.carflux.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	  @Bean
	     SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		  http
          .authorizeHttpRequests((authorize) -> authorize
              .anyRequest().permitAll()
          )
          .csrf((csrf) -> csrf.disable())
          .formLogin((form) -> form.disable());

      return http.build();
	    }
}
