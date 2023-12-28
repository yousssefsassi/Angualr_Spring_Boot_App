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

import com.lmobile.back.model.dto.RentedDeviceDto;
import com.lmobile.back.model.mapper.RentedDeviceMapper;
import com.lmobile.back.service.RentedDeviceService;

@RestController
@RequestMapping("/v1/service/rented-device")
public class RentedDeviceController {
  
  @Autowired
  private RentedDeviceService rentedDeviceService;

  @PostMapping(value = "")
  public ResponseEntity<RentedDeviceDto> create(@RequestBody RentedDeviceDto rentedDeviceDto) {
    RentedDeviceDto createdRentedDevice = RentedDeviceMapper.toDto(rentedDeviceService.save(RentedDeviceMapper.toEntity(rentedDeviceDto)));
    return new ResponseEntity<>(createdRentedDevice, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<RentedDeviceDto> getById(@PathVariable("id") Long id) {
    RentedDeviceDto foundRentedDevice = RentedDeviceMapper.toDto(rentedDeviceService.findById(id));
    return new ResponseEntity<>(foundRentedDevice, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<RentedDeviceDto>> getAll() {
    List<RentedDeviceDto> foundRentedDevice = RentedDeviceMapper.toDto(rentedDeviceService.findAll());
    return new ResponseEntity<>(foundRentedDevice, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<RentedDeviceDto> update(@PathVariable("id") Long id, @RequestBody RentedDeviceDto rentedDeviceDto) {
    RentedDeviceDto updatedRentedDevice = RentedDeviceMapper.toDto(rentedDeviceService.update(id, RentedDeviceMapper.toEntity(rentedDeviceDto)));
    return new ResponseEntity<>(updatedRentedDevice, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    rentedDeviceService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}