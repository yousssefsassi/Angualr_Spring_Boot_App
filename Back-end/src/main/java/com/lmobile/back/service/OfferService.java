package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.Offer;
import com.lmobile.back.repository.OfferRepository;

@Service
@Transactional
public class OfferService {
  
  @Autowired
  private OfferRepository offerRepository;
  
  public Offer save(Offer offer) {
    return offerRepository.save(offer);
  }
  
  public Offer findById(Long id) {
    return offerRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + Offer.class.getSimpleName() + " with id " + id));
  }
  
  public List<Offer> findAll() {
    return offerRepository.findAll();
  }
  
  public Offer update(Long id, Offer offer) {
    Offer foundOffer = findById(id);
    foundOffer.setCreatedAt(offer.getCreatedAt());
    return save(foundOffer);
  }
  
  public void deleteById(Long id) {
    offerRepository.deleteById(id);
  }
}
