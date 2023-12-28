package com.lmobile.back.controller;

import java.util.List;

import com.lmobile.back.model.entity.Salesman;
import com.lmobile.back.repository.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lmobile.back.model.dto.SalesmanDto;
import com.lmobile.back.model.mapper.SalesmanMapper;
import com.lmobile.back.service.SalesmanService;

@RestController
@RequestMapping("/v1/service/salesman")
@CrossOrigin("*")
public class SalesmanController {
  
  @Autowired
  private SalesmanService salesmanService;

  @Autowired
  private SalesmanRepository salesmanRepository;

  @PostMapping(value = "")
  public ResponseEntity<SalesmanDto> create(@RequestBody SalesmanDto salesmanDto) {
    SalesmanDto createdSalesman = SalesmanMapper.toDto(salesmanService.save(SalesmanMapper.toEntity(salesmanDto)));
    return new ResponseEntity<>(createdSalesman, HttpStatus.CREATED);
  }
  @PostMapping(value = "/update")
  public ResponseEntity<Salesman> updateNew(@RequestBody Salesman salesman) {
    return new ResponseEntity<>(salesmanRepository.save(salesman), HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<SalesmanDto> getById(@PathVariable("id") Long id) {
    SalesmanDto foundSalesman = SalesmanMapper.toDto(salesmanService.findById(id));
    return new ResponseEntity<>(foundSalesman, HttpStatus.OK);
  }
  @GetMapping(value = "/byemail/{email}")
  public ResponseEntity<Salesman> getByemail(@PathVariable("email") String email) {
    return new ResponseEntity<>(salesmanRepository.findByEmail(email).get(), HttpStatus.OK);
  }



  @GetMapping(value = "/all")
  public ResponseEntity<List<SalesmanDto>> getAll() {
    List<SalesmanDto> foundSalesman = SalesmanMapper.toDto(salesmanService.findAll());
    return new ResponseEntity<>(foundSalesman, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<SalesmanDto> update(@PathVariable("id") Long id, @RequestBody SalesmanDto salesmanDto) {
    SalesmanDto updatedSalesman = SalesmanMapper.toDto(salesmanService.update(id, SalesmanMapper.toEntity(salesmanDto)));
    return new ResponseEntity<>(updatedSalesman, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    salesmanService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}