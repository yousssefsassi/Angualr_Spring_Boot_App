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

import com.lmobile.back.model.dto.DeviceDto;
import com.lmobile.back.model.mapper.DeviceMapper;
import com.lmobile.back.service.DeviceService;

@RestController
@RequestMapping("/v1/service/device")
public class DeviceController {
  
  @Autowired
  private DeviceService deviceService;

  @PostMapping(value = "")
  public ResponseEntity<DeviceDto> create(@RequestBody DeviceDto deviceDto) {
    DeviceDto createdDevice = DeviceMapper.toDto(deviceService.save(DeviceMapper.toEntity(deviceDto)));
    return new ResponseEntity<>(createdDevice, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<DeviceDto> getById(@PathVariable("id") Long id) {
    DeviceDto foundDevice = DeviceMapper.toDto(deviceService.findById(id));
    return new ResponseEntity<>(foundDevice, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<DeviceDto>> getAll() {
    List<DeviceDto> foundDevice = DeviceMapper.toDto(deviceService.findAll());
    return new ResponseEntity<>(foundDevice, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<DeviceDto> update(@PathVariable("id") Long id, @RequestBody DeviceDto deviceDto) {
    DeviceDto updatedDevice = DeviceMapper.toDto(deviceService.update(id, DeviceMapper.toEntity(deviceDto)));
    return new ResponseEntity<>(updatedDevice, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    deviceService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}