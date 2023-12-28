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

import com.lmobile.back.model.dto.ContractDto;
import com.lmobile.back.model.mapper.ContractMapper;
import com.lmobile.back.service.ContractService;

@RestController
@RequestMapping("/v1/service/contract")
public class ContractController {
  
  @Autowired
  private ContractService contractService;

  @PostMapping(value = "")
  public ResponseEntity<ContractDto> create(@RequestBody ContractDto contractDto) {
    ContractDto createdContract = ContractMapper.toDto(contractService.save(ContractMapper.toEntity(contractDto)));
    return new ResponseEntity<>(createdContract, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<ContractDto> getById(@PathVariable("id") Long id) {
    ContractDto foundContract = ContractMapper.toDto(contractService.findById(id));
    return new ResponseEntity<>(foundContract, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<ContractDto>> getAll() {
    List<ContractDto> foundContract = ContractMapper.toDto(contractService.findAll());
    return new ResponseEntity<>(foundContract, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<ContractDto> update(@PathVariable("id") Long id, @RequestBody ContractDto contractDto) {
    ContractDto updatedContract = ContractMapper.toDto(contractService.update(id, ContractMapper.toEntity(contractDto)));
    return new ResponseEntity<>(updatedContract, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    contractService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}