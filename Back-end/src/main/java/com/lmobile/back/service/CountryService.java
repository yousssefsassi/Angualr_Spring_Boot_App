package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.Country;
import com.lmobile.back.repository.CountryRepository;

@Service
@Transactional
public class CountryService {
  
  @Autowired
  private CountryRepository countryRepository;
  
  public Country save(Country country) {
    return countryRepository.save(country);
  }
  
  public Country findById(Long id) {
    return countryRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + Country.class.getSimpleName() + " with id " + id));
  }
  
  public List<Country> findAll() {
    return countryRepository.findAll();
  }
  
  public Country update(Long id, Country country) {
    Country foundCountry = findById(id);
    foundCountry.setName(country.getName());
    return save(foundCountry);
  }
  
  public void deleteById(Long id) {
    countryRepository.deleteById(id);
  }
}
