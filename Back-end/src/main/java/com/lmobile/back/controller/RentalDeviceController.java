package com.lmobile.back.controller;

import java.util.List;

import com.lmobile.back.model.entity.RentalDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lmobile.back.model.dto.RentalDeviceDto;
import com.lmobile.back.model.mapper.RentalDeviceMapper;
import com.lmobile.back.service.RentalDeviceService;

@RestController
@RequestMapping("/v1/service/rental-device")
@CrossOrigin("*")
public class RentalDeviceController {
  
  @Autowired
  private RentalDeviceService rentalDeviceService;

  @PostMapping(value = "")
  public ResponseEntity<RentalDevice> create(@RequestBody RentalDevice rentalDevice) {
    rentalDeviceService.save(rentalDevice);
    return new ResponseEntity<>(null, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<RentalDevice> getById(@PathVariable("id") Long id) {
    return new ResponseEntity<>(rentalDeviceService.findById(id), HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<RentalDevice>> getAll() {
    return new ResponseEntity<>(rentalDeviceService.findAll(), HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<RentalDeviceDto> update(@PathVariable("id") Long id, @RequestBody RentalDeviceDto rentalDeviceDto) {
    RentalDeviceDto updatedRentalDevice = RentalDeviceMapper.toDto(rentalDeviceService.update(id, RentalDeviceMapper.toEntity(rentalDeviceDto)));
    return new ResponseEntity<>(updatedRentalDevice, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    rentalDeviceService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}