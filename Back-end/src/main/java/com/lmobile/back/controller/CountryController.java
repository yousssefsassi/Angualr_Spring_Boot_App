package com.lmobile.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmobile.back.model.dto.CountryDto;
import com.lmobile.back.model.mapper.CountryMapper;
import com.lmobile.back.service.CountryService;

@RestController
@RequestMapping("/v1/service/country")
public class CountryController {
  
  @Autowired
  private CountryService countryService;

  @PostMapping(value = "")
  // http://localhost:8088/lmobile/api/v1/service/country
  public ResponseEntity<CountryDto> create(@RequestBody CountryDto countryDto) {
    CountryDto createdCountry = CountryMapper.toDto(countryService.save(CountryMapper.toEntity(countryDto)));
    return new ResponseEntity<>(createdCountry, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  // http://localhost:8088/lmobile/api/v1/service/country/123
  public ResponseEntity<CountryDto> getById(@PathVariable("id") Long id) {
    CountryDto foundCountry = CountryMapper.toDto(countryService.findById(id));
    return new ResponseEntity<>(foundCountry, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  // http://localhost:8088/lmobile/api/v1/service/country/all
  public ResponseEntity<List<CountryDto>> getAll() {
    List<CountryDto> foundCountry = CountryMapper.toDto(countryService.findAll());
    return new ResponseEntity<>(foundCountry, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  // http://localhost:8088/lmobile/api/v1/service/country/123
  public ResponseEntity<CountryDto> update(@PathVariable("id") Long id, @RequestBody CountryDto countryDto) {
    CountryDto updatedCountry = CountryMapper.toDto(countryService.update(id, CountryMapper.toEntity(countryDto)));
    return new ResponseEntity<>(updatedCountry, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  // http://localhost:8088/lmobile/api/v1/service/country/123
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    countryService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}