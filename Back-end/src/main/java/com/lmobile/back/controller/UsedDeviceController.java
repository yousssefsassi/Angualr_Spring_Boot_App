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

import com.lmobile.back.model.dto.UsedDeviceDto;
import com.lmobile.back.model.mapper.UsedDeviceMapper;
import com.lmobile.back.service.UsedDeviceService;

@RestController
@RequestMapping("/v1/service/used-device")
public class UsedDeviceController {
  
  @Autowired
  private UsedDeviceService usedDeviceService;

  @PostMapping(value = "")
  public ResponseEntity<UsedDeviceDto> create(@RequestBody UsedDeviceDto usedDeviceDto) {
    UsedDeviceDto createdUsedDevice = UsedDeviceMapper.toDto(usedDeviceService.save(UsedDeviceMapper.toEntity(usedDeviceDto)));
    return new ResponseEntity<>(createdUsedDevice, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<UsedDeviceDto> getById(@PathVariable("id") Long id) {
    UsedDeviceDto foundUsedDevice = UsedDeviceMapper.toDto(usedDeviceService.findById(id));
    return new ResponseEntity<>(foundUsedDevice, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<UsedDeviceDto>> getAll() {
    List<UsedDeviceDto> foundUsedDevice = UsedDeviceMapper.toDto(usedDeviceService.findAll());
    return new ResponseEntity<>(foundUsedDevice, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<UsedDeviceDto> update(@PathVariable("id") Long id, @RequestBody UsedDeviceDto usedDeviceDto) {
    UsedDeviceDto updatedUsedDevice = UsedDeviceMapper.toDto(usedDeviceService.update(id, UsedDeviceMapper.toEntity(usedDeviceDto)));
    return new ResponseEntity<>(updatedUsedDevice, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    usedDeviceService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}