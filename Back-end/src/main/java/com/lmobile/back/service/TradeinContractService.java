package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.TradeinContract;
import com.lmobile.back.repository.TradeinContractRepository;

@Service
@Transactional
public class TradeinContractService {
  
  @Autowired
  private TradeinContractRepository tradeinContractRepository;
  
  public TradeinContract save(TradeinContract tradeinContract) {
    return tradeinContractRepository.save(tradeinContract);
  }
  
  public TradeinContract findById(Long id) {
    return tradeinContractRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + TradeinContract.class.getSimpleName() + " with id " + id));
  }
  
  public List<TradeinContract> findAll() {
    return tradeinContractRepository.findAll();
  }
  
  public TradeinContract update(Long id, TradeinContract tradeinContract) {
    TradeinContract foundTradeinContract = findById(id);
    foundTradeinContract.setReference(tradeinContract.getReference());
    foundTradeinContract.setSignedByOwnerAt(tradeinContract.getSignedByOwnerAt());
    foundTradeinContract.setSignedByPartnerAt(tradeinContract.getSignedByPartnerAt());
    foundTradeinContract.setCreatedAt(tradeinContract.getCreatedAt());
    
    foundTradeinContract.setTradeinOffer(tradeinContract.getTradeinOffer());
    return save(foundTradeinContract);
  }
  
  public void deleteById(Long id) {
    tradeinContractRepository.deleteById(id);
  }
}
