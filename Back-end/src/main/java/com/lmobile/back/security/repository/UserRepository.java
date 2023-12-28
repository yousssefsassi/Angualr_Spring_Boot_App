package com.lmobile.back.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmobile.back.security.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmail(String email);
}
