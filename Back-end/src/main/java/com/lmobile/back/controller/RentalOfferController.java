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

import com.lmobile.back.model.dto.RentalOfferDto;
import com.lmobile.back.model.mapper.RentalOfferMapper;
import com.lmobile.back.service.RentalOfferService;

@RestController
@RequestMapping("/v1/service/rental-offer")
public class RentalOfferController {
  
  @Autowired
  private RentalOfferService rentalOfferService;

  @PostMapping(value = "")
  public ResponseEntity<RentalOfferDto> create(@RequestBody RentalOfferDto rentalOfferDto) {
    RentalOfferDto createdRentalOffer = RentalOfferMapper.toDto(rentalOfferService.save(RentalOfferMapper.toEntity(rentalOfferDto)));
    return new ResponseEntity<>(createdRentalOffer, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<RentalOfferDto> getById(@PathVariable("id") Long id) {
    RentalOfferDto foundRentalOffer = RentalOfferMapper.toDto(rentalOfferService.findById(id));
    return new ResponseEntity<>(foundRentalOffer, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<RentalOfferDto>> getAll() {
    List<RentalOfferDto> foundRentalOffer = RentalOfferMapper.toDto(rentalOfferService.findAll());
    return new ResponseEntity<>(foundRentalOffer, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<RentalOfferDto> update(@PathVariable("id") Long id, @RequestBody RentalOfferDto rentalOfferDto) {
    RentalOfferDto updatedRentalOffer = RentalOfferMapper.toDto(rentalOfferService.update(id, RentalOfferMapper.toEntity(rentalOfferDto)));
    return new ResponseEntity<>(updatedRentalOffer, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    rentalOfferService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}