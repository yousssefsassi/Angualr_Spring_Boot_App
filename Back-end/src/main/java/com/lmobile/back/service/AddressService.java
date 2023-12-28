package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.Address;
import com.lmobile.back.repository.AddressRepository;

@Service
@Transactional
public class AddressService {
  
  @Autowired
  private AddressRepository addressRepository;
  
  public Address save(Address address) {
    return addressRepository.save(address);
  }
  
  public Address findById(Long id) {
    return addressRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + Address.class.getSimpleName() + " with id " + id));
  }
  
  public List<Address> findAll() {
    return addressRepository.findAll();
  }
  
  public Address update(Long id, Address address) {
    Address foundAddress = findById(id);
    foundAddress.setStreet(address.getStreet());
    foundAddress.setCity(address.getCity());
    foundAddress.setCountry(address.getCountry());
    foundAddress.setZipCode(address.getZipCode());
    return save(foundAddress);
  }
  
  public void deleteById(Long id) {
    addressRepository.deleteById(id);
  }
}
