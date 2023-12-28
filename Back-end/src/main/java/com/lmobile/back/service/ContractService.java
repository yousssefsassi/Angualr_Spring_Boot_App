package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.Contract;
import com.lmobile.back.repository.ContractRepository;

@Service
@Transactional
public class ContractService {
  
  @Autowired
  private ContractRepository contractRepository;
  
  public Contract save(Contract contract) {
    return contractRepository.save(contract);
  }
  
  public Contract findById(Long id) {
    return contractRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + Contract.class.getSimpleName() + " with id " + id));
  }
  
  public List<Contract> findAll() {
    return contractRepository.findAll();
  }
  
  public Contract update(Long id, Contract contract) {
    Contract foundContract = findById(id);
    foundContract.setReference(contract.getReference());
    foundContract.setSignedByOwnerAt(contract.getSignedByOwnerAt());
    foundContract.setSignedByPartnerAt(contract.getSignedByPartnerAt());
    foundContract.setCreatedAt(contract.getCreatedAt());
    return save(foundContract);
  }
  
  public void deleteById(Long id) {
    contractRepository.deleteById(id);
  }
}
