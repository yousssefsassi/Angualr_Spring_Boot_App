package com.lmobile.back.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.lmobile.back.security.exception.JwtAuthenticationEntryPoint;
import com.lmobile.back.security.filter.JwtAuthFilter;
import com.lmobile.back.security.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true)
public class WebSecurityConfiguration {

  @Autowired
  private JwtAuthFilter jwtAuthenticationFilter;
  @Autowired
  private CustomUserDetailsService customUserDetailsService;
  @Autowired
  private JwtAuthenticationEntryPoint unauthorizedHandler;

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
      .csrf()
        .disable()
      .exceptionHandling()
        .authenticationEntryPoint(unauthorizedHandler)
      .and()
      .authorizeHttpRequests()
      .requestMatchers("/v1/service/auth/**","/**")
        .permitAll()
      .anyRequest()
        .authenticated()
//      .anyRequest()
//        .permitAll()
      .and()
      .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
      .and()
      .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
      .userDetailsService(customUserDetailsService)
      .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

}
