package com.lmobile.back.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lmobile.back.security.model.business.CustomUserDetails;

@Service
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  private UserService userService;

  @Override
  public CustomUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    try {
      return new CustomUserDetails(userService.findByEmail(email));
    } catch (Exception e) {
      throw new UsernameNotFoundException("can't find user with email " + email);
    }
  }
}
