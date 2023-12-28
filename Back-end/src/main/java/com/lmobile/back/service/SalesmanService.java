package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.Salesman;
import com.lmobile.back.repository.SalesmanRepository;

@Service
@Transactional
public class SalesmanService {
  
  @Autowired
  private SalesmanRepository salesmanRepository;
  
  public Salesman save(Salesman salesman) {
    return salesmanRepository.save(salesman);
  }
  
  public Salesman findById(Long id) {
    return salesmanRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + Salesman.class.getSimpleName() + " with id " + id));
  }
  
  public List<Salesman> findAll() {
    return salesmanRepository.findAll();
  }
  
  public Salesman update(Long id, Salesman salesman) {
    Salesman foundSalesman = findById(id);
    foundSalesman.setFirstName(salesman.getFirstName());
    foundSalesman.setLastName(salesman.getLastName());
    foundSalesman.setEmail(salesman.getEmail());
    foundSalesman.setProfilePhotoFilePath(salesman.getProfilePhotoFilePath());
    foundSalesman.setAddress(salesman.getAddress());
    
    foundSalesman.setBusinessType(salesman.getBusinessType());
    foundSalesman.setDeviceList(salesman.getDeviceList());
    return save(foundSalesman);
  }
  
  public void deleteById(Long id) {
    salesmanRepository.deleteById(id);
  }
}
