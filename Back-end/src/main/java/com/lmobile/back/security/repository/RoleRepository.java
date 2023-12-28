package com.lmobile.back.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmobile.back.security.constant.RoleType;
import com.lmobile.back.security.model.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  
  Role findByName(RoleType roleType);
}
