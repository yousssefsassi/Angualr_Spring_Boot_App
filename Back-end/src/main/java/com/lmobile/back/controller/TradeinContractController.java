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

import com.lmobile.back.model.dto.TradeinContractDto;
import com.lmobile.back.model.mapper.TradeinContractMapper;
import com.lmobile.back.service.TradeinContractService;

@RestController
@RequestMapping("/v1/service/tradein-contract")
public class TradeinContractController {
  
  @Autowired
  private TradeinContractService tradeinContractService;

  @PostMapping(value = "")
  public ResponseEntity<TradeinContractDto> create(@RequestBody TradeinContractDto tradeinContractDto) {
    TradeinContractDto createdTradeinContract = TradeinContractMapper.toDto(tradeinContractService.save(TradeinContractMapper.toEntity(tradeinContractDto)));
    return new ResponseEntity<>(createdTradeinContract, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<TradeinContractDto> getById(@PathVariable("id") Long id) {
    TradeinContractDto foundTradeinContract = TradeinContractMapper.toDto(tradeinContractService.findById(id));
    return new ResponseEntity<>(foundTradeinContract, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<TradeinContractDto>> getAll() {
    List<TradeinContractDto> foundTradeinContract = TradeinContractMapper.toDto(tradeinContractService.findAll());
    return new ResponseEntity<>(foundTradeinContract, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<TradeinContractDto> update(@PathVariable("id") Long id, @RequestBody TradeinContractDto tradeinContractDto) {
    TradeinContractDto updatedTradeinContract = TradeinContractMapper.toDto(tradeinContractService.update(id, TradeinContractMapper.toEntity(tradeinContractDto)));
    return new ResponseEntity<>(updatedTradeinContract, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    tradeinContractService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}