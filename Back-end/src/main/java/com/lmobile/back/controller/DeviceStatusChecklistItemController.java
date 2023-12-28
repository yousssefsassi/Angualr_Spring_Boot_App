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

import com.lmobile.back.model.dto.DeviceStatusChecklistItemDto;
import com.lmobile.back.model.mapper.DeviceStatusChecklistItemMapper;
import com.lmobile.back.service.DeviceStatusChecklistItemService;

@RestController
@RequestMapping("/v1/service/device-status-checklist-item")
public class DeviceStatusChecklistItemController {
  
  @Autowired
  private DeviceStatusChecklistItemService deviceStatusChecklistItemService;

  @PostMapping(value = "")
  public ResponseEntity<DeviceStatusChecklistItemDto> create(@RequestBody DeviceStatusChecklistItemDto deviceStatusChecklistItemDto) {
    DeviceStatusChecklistItemDto createdDeviceStatusChecklistItem = DeviceStatusChecklistItemMapper.toDto(deviceStatusChecklistItemService.save(DeviceStatusChecklistItemMapper.toEntity(deviceStatusChecklistItemDto)));
    return new ResponseEntity<>(createdDeviceStatusChecklistItem, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<DeviceStatusChecklistItemDto> getById(@PathVariable("id") Long id) {
    DeviceStatusChecklistItemDto foundDeviceStatusChecklistItem = DeviceStatusChecklistItemMapper.toDto(deviceStatusChecklistItemService.findById(id));
    return new ResponseEntity<>(foundDeviceStatusChecklistItem, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<DeviceStatusChecklistItemDto>> getAll() {
    List<DeviceStatusChecklistItemDto> foundDeviceStatusChecklistItem = DeviceStatusChecklistItemMapper.toDto(deviceStatusChecklistItemService.findAll());
    return new ResponseEntity<>(foundDeviceStatusChecklistItem, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<DeviceStatusChecklistItemDto> update(@PathVariable("id") Long id, @RequestBody DeviceStatusChecklistItemDto deviceStatusChecklistItemDto) {
    DeviceStatusChecklistItemDto updatedDeviceStatusChecklistItem = DeviceStatusChecklistItemMapper.toDto(deviceStatusChecklistItemService.update(id, DeviceStatusChecklistItemMapper.toEntity(deviceStatusChecklistItemDto)));
    return new ResponseEntity<>(updatedDeviceStatusChecklistItem, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    deviceStatusChecklistItemService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}