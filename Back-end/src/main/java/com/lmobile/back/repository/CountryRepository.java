package com.lmobile.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmobile.back.model.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
