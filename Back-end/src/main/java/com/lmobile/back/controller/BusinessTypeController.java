package com.lmobile.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lmobile.back.model.dto.BusinessTypeDto;
import com.lmobile.back.model.mapper.BusinessTypeMapper;
import com.lmobile.back.service.BusinessTypeService;

@RestController
@RequestMapping("/v1/service/business-type")
public class BusinessTypeController {
  
  @Autowired
  private BusinessTypeService businessTypeService;

  @PostMapping(value = "")
  public ResponseEntity<BusinessTypeDto> create(@RequestBody BusinessTypeDto businessTypeDto) {
    BusinessTypeDto createdBusinessType = BusinessTypeMapper.toDto(businessTypeService.save(BusinessTypeMapper.toEntity(businessTypeDto)));
    return new ResponseEntity<>(createdBusinessType, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<BusinessTypeDto> getById(@PathVariable("id") Long id) {
    BusinessTypeDto foundBusinessType = BusinessTypeMapper.toDto(businessTypeService.findById(id));
    return new ResponseEntity<>(foundBusinessType, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<BusinessTypeDto>> getAll() {
    List<BusinessTypeDto> foundBusinessType = BusinessTypeMapper.toDto(businessTypeService.findAll());
    return new ResponseEntity<>(foundBusinessType, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<BusinessTypeDto> update(@PathVariable("id") Long id, @RequestBody BusinessTypeDto businessTypeDto) {
    BusinessTypeDto updatedBusinessType = BusinessTypeMapper.toDto(businessTypeService.update(id, BusinessTypeMapper.toEntity(businessTypeDto)));
    return new ResponseEntity<>(updatedBusinessType, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    businessTypeService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}