package com.lmobile.back.security.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.lmobile.back.security.model.business.CustomUserDetails;
import com.lmobile.back.security.service.CustomUserDetailsService;
import com.lmobile.back.security.service.JwtUtilityService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {

  @Autowired
  private CustomUserDetailsService customUserDetailsService;
  @Autowired
  private JwtUtilityService jwtUtilityService;

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {

    // don't intercept request if it's sent to AuthController
    if (request.getServletPath().contains("/v1/service/auth")) {
      filterChain.doFilter(request, response);
      return;
    }

    // don't intercept request if it doesn't have an Authorization header having a value that starts with "Bearer "
    final String authHeader = request.getHeader("Authorization");
    if (authHeader == null || !authHeader.startsWith("Bearer ")) {
      filterChain.doFilter(request, response);
      return;
    }

    // intercept request
    //  - get user name from jwt (its email)
    //  - load user details from db by its email
    //  - validate jwt based on loaded user details
    //  - update security context using a generated authentication object (not actually performing an authentication operation using the authentication manager, like with AuthenticationService.authenticate(), here we believe the token after validation)
    final String jwt = authHeader.substring(7);
    final String userEmail = jwtUtilityService.extractUsername(jwt);
    if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null) {
      CustomUserDetails customUserDetails = customUserDetailsService.loadUserByUsername(userEmail);
      if (jwtUtilityService.validateToken(jwt, customUserDetails)) {
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
            customUserDetails,
            null,
            customUserDetails.getAuthorities());
        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authentication);
      }
    }
    
    filterChain.doFilter(request, response);
  }
}

