package com.gotreaux.site.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.headers(
                        headers ->
                                headers.httpStrictTransportSecurity(
                                        hsts -> hsts.preload(true).maxAgeInSeconds(63072000L)))
                .authorizeHttpRequests(request -> request.anyRequest().permitAll())
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager() {
        return _ -> {
            throw new UnsupportedOperationException("Authentication is disabled");
        };
    }
}
