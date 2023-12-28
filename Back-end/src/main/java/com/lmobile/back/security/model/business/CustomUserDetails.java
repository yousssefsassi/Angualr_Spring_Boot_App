package com.lmobile.back.security.model.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.lmobile.back.security.model.entity.Role;
import com.lmobile.back.security.model.entity.User;


public class CustomUserDetails implements UserDetails {
  
    private final User user;

    public CustomUserDetails(User user) {
        this.user = user;
    }
    
    

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<GrantedAuthority>();
  
        this.user.getRoleList().forEach((Role role) -> {
          grantedAuthorityList.add(new SimpleGrantedAuthority(role.getName().toString().toUpperCase()));
        });
  
        return grantedAuthorityList;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
      return true;
    }
}
