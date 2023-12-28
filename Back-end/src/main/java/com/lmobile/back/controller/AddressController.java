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

import com.lmobile.back.model.dto.AddressDto;
import com.lmobile.back.model.mapper.AddressMapper;
import com.lmobile.back.service.AddressService;

@RestController
@RequestMapping("/v1/service/address")
public class AddressController {
  
  @Autowired
  private AddressService addressService;

  @PostMapping(value = "")
  public ResponseEntity<AddressDto> create(@RequestBody AddressDto addressDto) {
    AddressDto createdAddress = AddressMapper.toDto(addressService.save(AddressMapper.toEntity(addressDto)));
    return new ResponseEntity<>(createdAddress, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<AddressDto> getById(@PathVariable("id") Long id) {
    AddressDto foundAddress = AddressMapper.toDto(addressService.findById(id));
    return new ResponseEntity<>(foundAddress, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<AddressDto>> getAll() {
    List<AddressDto> foundAddress = AddressMapper.toDto(addressService.findAll());
    return new ResponseEntity<>(foundAddress, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<AddressDto> update(@PathVariable("id") Long id, @RequestBody AddressDto addressDto) {
    AddressDto updatedAddress = AddressMapper.toDto(addressService.update(id, AddressMapper.toEntity(addressDto)));
    return new ResponseEntity<>(updatedAddress, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    addressService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}