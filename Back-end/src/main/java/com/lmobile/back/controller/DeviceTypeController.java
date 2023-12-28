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

import com.lmobile.back.model.dto.DeviceTypeDto;
import com.lmobile.back.model.mapper.DeviceTypeMapper;
import com.lmobile.back.service.DeviceTypeService;

@RestController
@RequestMapping("/v1/service/device-type")
public class DeviceTypeController {
  
  @Autowired
  private DeviceTypeService deviceTypeService;

  @PostMapping(value = "")
  public ResponseEntity<DeviceTypeDto> create(@RequestBody DeviceTypeDto deviceTypeDto) {
    DeviceTypeDto createdDeviceType = DeviceTypeMapper.toDto(deviceTypeService.save(DeviceTypeMapper.toEntity(deviceTypeDto)));
    return new ResponseEntity<>(createdDeviceType, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<DeviceTypeDto> getById(@PathVariable("id") Long id) {
    DeviceTypeDto foundDeviceType = DeviceTypeMapper.toDto(deviceTypeService.findById(id));
    return new ResponseEntity<>(foundDeviceType, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<DeviceTypeDto>> getAll() {
    List<DeviceTypeDto> foundDeviceType = DeviceTypeMapper.toDto(deviceTypeService.findAll());
    return new ResponseEntity<>(foundDeviceType, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<DeviceTypeDto> update(@PathVariable("id") Long id, @RequestBody DeviceTypeDto deviceTypeDto) {
    DeviceTypeDto updatedDeviceType = DeviceTypeMapper.toDto(deviceTypeService.update(id, DeviceTypeMapper.toEntity(deviceTypeDto)));
    return new ResponseEntity<>(updatedDeviceType, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    deviceTypeService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}