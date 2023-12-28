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

import com.lmobile.back.model.dto.DeviceStatusChecklistDto;
import com.lmobile.back.model.mapper.DeviceStatusChecklistMapper;
import com.lmobile.back.service.DeviceStatusChecklistService;

@RestController
@RequestMapping("/v1/service/device-status-checklist")
public class DeviceStatusChecklistController {
  
  @Autowired
  private DeviceStatusChecklistService deviceStatusChecklistService;

  @PostMapping(value = "")
  public ResponseEntity<DeviceStatusChecklistDto> create(@RequestBody DeviceStatusChecklistDto deviceStatusChecklistDto) {
    DeviceStatusChecklistDto createdDeviceStatusChecklist = DeviceStatusChecklistMapper.toDto(deviceStatusChecklistService.save(DeviceStatusChecklistMapper.toEntity(deviceStatusChecklistDto)));
    return new ResponseEntity<>(createdDeviceStatusChecklist, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<DeviceStatusChecklistDto> getById(@PathVariable("id") Long id) {
    DeviceStatusChecklistDto foundDeviceStatusChecklist = DeviceStatusChecklistMapper.toDto(deviceStatusChecklistService.findById(id));
    return new ResponseEntity<>(foundDeviceStatusChecklist, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<DeviceStatusChecklistDto>> getAll() {
    List<DeviceStatusChecklistDto> foundDeviceStatusChecklist = DeviceStatusChecklistMapper.toDto(deviceStatusChecklistService.findAll());
    return new ResponseEntity<>(foundDeviceStatusChecklist, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<DeviceStatusChecklistDto> update(@PathVariable("id") Long id, @RequestBody DeviceStatusChecklistDto deviceStatusChecklistDto) {
    DeviceStatusChecklistDto updatedDeviceStatusChecklist = DeviceStatusChecklistMapper.toDto(deviceStatusChecklistService.update(id, DeviceStatusChecklistMapper.toEntity(deviceStatusChecklistDto)));
    return new ResponseEntity<>(updatedDeviceStatusChecklist, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    deviceStatusChecklistService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}