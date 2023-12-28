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

import com.lmobile.back.model.dto.OfferDto;
import com.lmobile.back.model.mapper.OfferMapper;
import com.lmobile.back.service.OfferService;

@RestController
@RequestMapping("/v1/service/offer")
public class OfferController {
  
  @Autowired
  private OfferService offerService;

  @PostMapping(value = "")
  public ResponseEntity<OfferDto> create(@RequestBody OfferDto offerDto) {
    OfferDto createdOffer = OfferMapper.toDto(offerService.save(OfferMapper.toEntity(offerDto)));
    return new ResponseEntity<>(createdOffer, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<OfferDto> getById(@PathVariable("id") Long id) {
    OfferDto foundOffer = OfferMapper.toDto(offerService.findById(id));
    return new ResponseEntity<>(foundOffer, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<OfferDto>> getAll() {
    List<OfferDto> foundOffer = OfferMapper.toDto(offerService.findAll());
    return new ResponseEntity<>(foundOffer, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<OfferDto> update(@PathVariable("id") Long id, @RequestBody OfferDto offerDto) {
    OfferDto updatedOffer = OfferMapper.toDto(offerService.update(id, OfferMapper.toEntity(offerDto)));
    return new ResponseEntity<>(updatedOffer, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    offerService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}