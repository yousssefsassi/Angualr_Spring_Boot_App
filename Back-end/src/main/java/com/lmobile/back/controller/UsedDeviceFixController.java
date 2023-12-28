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

import com.lmobile.back.model.dto.UsedDeviceFixDto;
import com.lmobile.back.model.mapper.UsedDeviceFixMapper;
import com.lmobile.back.service.UsedDeviceFixService;

@RestController
@RequestMapping("/v1/service/used-device-fix")
public class UsedDeviceFixController {
  
  @Autowired
  private UsedDeviceFixService usedDeviceFixService;

  @PostMapping(value = "")
  public ResponseEntity<UsedDeviceFixDto> create(@RequestBody UsedDeviceFixDto usedDeviceFixDto) {
    UsedDeviceFixDto createdUsedDeviceFix = UsedDeviceFixMapper.toDto(usedDeviceFixService.save(UsedDeviceFixMapper.toEntity(usedDeviceFixDto)));
    return new ResponseEntity<>(createdUsedDeviceFix, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<UsedDeviceFixDto> getById(@PathVariable("id") Long id) {
    UsedDeviceFixDto foundUsedDeviceFix = UsedDeviceFixMapper.toDto(usedDeviceFixService.findById(id));
    return new ResponseEntity<>(foundUsedDeviceFix, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<UsedDeviceFixDto>> getAll() {
    List<UsedDeviceFixDto> foundUsedDeviceFix = UsedDeviceFixMapper.toDto(usedDeviceFixService.findAll());
    return new ResponseEntity<>(foundUsedDeviceFix, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<UsedDeviceFixDto> update(@PathVariable("id") Long id, @RequestBody UsedDeviceFixDto usedDeviceFixDto) {
    UsedDeviceFixDto updatedUsedDeviceFix = UsedDeviceFixMapper.toDto(usedDeviceFixService.update(id, UsedDeviceFixMapper.toEntity(usedDeviceFixDto)));
    return new ResponseEntity<>(updatedUsedDeviceFix, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    usedDeviceFixService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}