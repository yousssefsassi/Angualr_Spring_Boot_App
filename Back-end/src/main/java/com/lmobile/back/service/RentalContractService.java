package com.lmobile.back.service;

import java.util.ArrayList;
import java.util.List;

import com.lmobile.back.model.entity.RentalDevice;
import com.lmobile.back.repository.RentalDeviceRepository;
import com.lmobile.back.repository.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.RentalContract;
import com.lmobile.back.repository.RentalContractRepository;

@Service
@Transactional
public class RentalContractService {
  
  @Autowired
  private RentalContractRepository rentalContractRepository;
  @Autowired
  private RentalDeviceRepository rentalDeviceRepository;
  @Autowired
  private SalesmanRepository salesmanRepository;
  public RentalContract save(RentalContract rentalContract) {
    rentalContract.setSalesman(salesmanRepository.findByEmail(rentalContract.getSalesman().getEmail()).get());
    RentalContract rentalContractsaved = rentalContractRepository.save(rentalContract);
    List<RentalDevice> rentalDevices = rentalContract.getRentalDevices();
    for(RentalDevice r : rentalDevices){
      if(r.getRentalContracts() == null){
        r.setRentalContracts(new ArrayList<>());
      }
      r.getRentalContracts().add(rentalContractsaved);
      rentalDeviceRepository.save(r);
    }
    return rentalContractsaved;
  }
  
  public RentalContract findById(Long id) {
    return rentalContractRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + RentalContract.class.getSimpleName() + " with id " + id));
  }
  
  public List<RentalContract> findAll() {
    return rentalContractRepository.findAll();
  }
  
  public RentalContract update(Long id, RentalContract rentalContract) {
    RentalContract foundRentalContract = findById(id);
    foundRentalContract.setReference(rentalContract.getReference());
    foundRentalContract.setSignedByOwnerAt(rentalContract.getSignedByOwnerAt());
    foundRentalContract.setSignedByPartnerAt(rentalContract.getSignedByPartnerAt());
    foundRentalContract.setCreatedAt(rentalContract.getCreatedAt());
    
    foundRentalContract.setValidFrom(rentalContract.getValidFrom());
    foundRentalContract.setValidTo(rentalContract.getValidTo());
    foundRentalContract.setPrice(rentalContract.getPrice());
    foundRentalContract.setRentalOffer(rentalContract.getRentalOffer());
    return save(foundRentalContract);
  }
  
  public void deleteById(Long id) {
    rentalContractRepository.deleteById(id);
  }
}
