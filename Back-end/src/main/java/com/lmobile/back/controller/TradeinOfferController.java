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

import com.lmobile.back.model.dto.TradeinOfferDto;
import com.lmobile.back.model.mapper.TradeinOfferMapper;
import com.lmobile.back.service.TradeinOfferService;

@RestController
@RequestMapping("/v1/service/tradein-offer")
public class TradeinOfferController {
  
  @Autowired
  private TradeinOfferService tradeinOfferService;

  @PostMapping(value = "")
  public ResponseEntity<TradeinOfferDto> create(@RequestBody TradeinOfferDto tradeinOfferDto) {
    TradeinOfferDto createdTradeinOffer = TradeinOfferMapper.toDto(tradeinOfferService.save(TradeinOfferMapper.toEntity(tradeinOfferDto)));
    return new ResponseEntity<>(createdTradeinOffer, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<TradeinOfferDto> getById(@PathVariable("id") Long id) {
    TradeinOfferDto foundTradeinOffer = TradeinOfferMapper.toDto(tradeinOfferService.findById(id));
    return new ResponseEntity<>(foundTradeinOffer, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<TradeinOfferDto>> getAll() {
    List<TradeinOfferDto> foundTradeinOffer = TradeinOfferMapper.toDto(tradeinOfferService.findAll());
    return new ResponseEntity<>(foundTradeinOffer, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<TradeinOfferDto> update(@PathVariable("id") Long id, @RequestBody TradeinOfferDto tradeinOfferDto) {
    TradeinOfferDto updatedTradeinOffer = TradeinOfferMapper.toDto(tradeinOfferService.update(id, TradeinOfferMapper.toEntity(tradeinOfferDto)));
    return new ResponseEntity<>(updatedTradeinOffer, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    tradeinOfferService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}