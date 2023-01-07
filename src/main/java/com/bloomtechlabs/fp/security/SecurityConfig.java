package com.bloomtechlabs.fp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * {@link SecurityConfig} is a configuration class for Spring Security that
 * will provide an instance of {@link SecurityFilterChain} and enable the
 * user to log in with 0Auth2.
 */
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.oauth2Login()
                 .and().build();
    }
}
