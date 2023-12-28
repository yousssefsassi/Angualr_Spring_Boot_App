package com.lmobile.back.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmobile.back.security.constant.RoleType;
import com.lmobile.back.security.model.entity.Role;
import com.lmobile.back.security.repository.RoleRepository;

@Service
public class RoleService {
  
  @Autowired
  private RoleRepository roleRepository;


  public Role findByName(RoleType roleType) {
    Role foundRole = roleRepository.findByName(roleType);
    /*if (foundRole == null) {
      throw new IllegalStateException("Unable to find " + Role.class.getSimpleName() + " with name " + roleType);
    }*/
    return foundRole;
  }
  
  public Role findById(Long id) {
    return roleRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + Role.class.getSimpleName() + " with id " + id));
  }
}
