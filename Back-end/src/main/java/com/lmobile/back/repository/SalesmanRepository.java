package com.lmobile.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmobile.back.model.entity.Salesman;

import java.util.Optional;

@Repository
public interface SalesmanRepository extends JpaRepository<Salesman, Long> {

    Optional<Salesman> findByEmail(String email);
}
