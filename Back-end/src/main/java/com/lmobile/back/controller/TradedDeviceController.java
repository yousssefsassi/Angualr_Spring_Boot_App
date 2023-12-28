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

import com.lmobile.back.model.dto.TradedDeviceDto;
import com.lmobile.back.model.mapper.TradedDeviceMapper;
import com.lmobile.back.service.TradedDeviceService;

@RestController
@RequestMapping("/v1/service/traded-device")
public class TradedDeviceController {
  
  @Autowired
  private TradedDeviceService tradedDeviceService;

  @PostMapping(value = "")
  public ResponseEntity<TradedDeviceDto> create(@RequestBody TradedDeviceDto tradedDeviceDto) {
    TradedDeviceDto createdTradedDevice = TradedDeviceMapper.toDto(tradedDeviceService.save(TradedDeviceMapper.toEntity(tradedDeviceDto)));
    return new ResponseEntity<>(createdTradedDevice, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<TradedDeviceDto> getById(@PathVariable("id") Long id) {
    TradedDeviceDto foundTradedDevice = TradedDeviceMapper.toDto(tradedDeviceService.findById(id));
    return new ResponseEntity<>(foundTradedDevice, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<TradedDeviceDto>> getAll() {
    List<TradedDeviceDto> foundTradedDevice = TradedDeviceMapper.toDto(tradedDeviceService.findAll());
    return new ResponseEntity<>(foundTradedDevice, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<TradedDeviceDto> update(@PathVariable("id") Long id, @RequestBody TradedDeviceDto tradedDeviceDto) {
    TradedDeviceDto updatedTradedDevice = TradedDeviceMapper.toDto(tradedDeviceService.update(id, TradedDeviceMapper.toEntity(tradedDeviceDto)));
    return new ResponseEntity<>(updatedTradedDevice, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    tradedDeviceService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}