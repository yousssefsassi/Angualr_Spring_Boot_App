package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.RentalOffer;
import com.lmobile.back.repository.RentalOfferRepository;

@Service
@Transactional
public class RentalOfferService {
  
  @Autowired
  private RentalOfferRepository rentalOfferRepository;
  
  public RentalOffer save(RentalOffer rentalOffer) {
    return rentalOfferRepository.save(rentalOffer);
  }
  
  public RentalOffer findById(Long id) {
    return rentalOfferRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + RentalOffer.class.getSimpleName() + " with id " + id));
  }
  
  public List<RentalOffer> findAll() {
    return rentalOfferRepository.findAll();
  }
  
  public RentalOffer update(Long id, RentalOffer rentalOffer) {
    RentalOffer foundRentalOffer = findById(id);
    foundRentalOffer.setCreatedAt(rentalOffer.getCreatedAt());
    
    foundRentalOffer.setRentedDeviceList(rentalOffer.getRentedDeviceList());
    return save(foundRentalOffer);
  }
  
  public void deleteById(Long id) {
    rentalOfferRepository.deleteById(id);
  }
}
