package com.lmobile.back.controller;

import java.util.List;

import com.lmobile.back.model.entity.RentalContract;
import com.lmobile.back.repository.RentalContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lmobile.back.model.dto.RentalContractDto;
import com.lmobile.back.model.mapper.RentalContractMapper;
import com.lmobile.back.service.RentalContractService;

@RestController
@RequestMapping("/v1/service/rental-contract")
@CrossOrigin("*")
public class RentalContractController {
  
  @Autowired
  private RentalContractService rentalContractService;

  @Autowired
  private RentalContractRepository rentalContractRepository;

  @PostMapping(value = "")
  public ResponseEntity<RentalContract> create(@RequestBody RentalContract rentalContract) {
    return new ResponseEntity<>(rentalContractService.save(rentalContract), HttpStatus.CREATED);
  }
  @PostMapping(value = "/update")
  public ResponseEntity<RentalContract> updatenew(@RequestBody RentalContract rentalContract) {
    return new ResponseEntity<>(rentalContractRepository.save(rentalContract), HttpStatus.CREATED);
  }
  @GetMapping(value = "/{id}")
  public ResponseEntity<RentalContract> getById(@PathVariable("id") Long id) {
    return new ResponseEntity<>(rentalContractService.findById(id), HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<RentalContract>> getAll() {
    return new ResponseEntity<>(rentalContractService.findAll(), HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<RentalContractDto> update(@PathVariable("id") Long id, @RequestBody RentalContractDto rentalContractDto) {
    RentalContractDto updatedRentalContract = RentalContractMapper.toDto(rentalContractService.update(id, RentalContractMapper.toEntity(rentalContractDto)));
    return new ResponseEntity<>(updatedRentalContract, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    rentalContractService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}