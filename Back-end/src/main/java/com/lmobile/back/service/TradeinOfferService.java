package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.TradeinOffer;
import com.lmobile.back.repository.TradeinOfferRepository;

@Service
@Transactional
public class TradeinOfferService {
  
  @Autowired
  private TradeinOfferRepository tradeinOfferRepository;
  
  public TradeinOffer save(TradeinOffer tradeinOffer) {
    return tradeinOfferRepository.save(tradeinOffer);
  }
  
  public TradeinOffer findById(Long id) {
    return tradeinOfferRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + TradeinOffer.class.getSimpleName() + " with id " + id));
  }
  
  public List<TradeinOffer> findAll() {
    return tradeinOfferRepository.findAll();
  }
  
  public TradeinOffer update(Long id, TradeinOffer tradeinOffer) {
    TradeinOffer foundTradeinOffer = findById(id);
    foundTradeinOffer.setCreatedAt(tradeinOffer.getCreatedAt());
    
    foundTradeinOffer.setTradedDeviceList(tradeinOffer.getTradedDeviceList());
    foundTradeinOffer.setOriginalTradeinOffer(tradeinOffer.getOriginalTradeinOffer());
    foundTradeinOffer.setProposedTradinOfferList(tradeinOffer.getProposedTradinOfferList());
    return save(foundTradeinOffer);
  }
  
  public void deleteById(Long id) {
    tradeinOfferRepository.deleteById(id);
  }
}
