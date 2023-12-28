package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.BusinessType;
import com.lmobile.back.repository.BusinessTypeRepository;

@Service
@Transactional
public class BusinessTypeService {
  
  @Autowired
  private BusinessTypeRepository businessTypeRepository;
  
  public BusinessType save(BusinessType businessType) {
    return businessTypeRepository.save(businessType);
  }
  
  public BusinessType findById(Long id) {
    return businessTypeRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + BusinessType.class.getSimpleName() + " with id " + id));
  }
  
  public List<BusinessType> findAll() {
    return businessTypeRepository.findAll();
  }
  
  public BusinessType update(Long id, BusinessType businessType) {
    BusinessType foundBusinessType = findById(id);
    foundBusinessType.setName(businessType.getName());
    return save(foundBusinessType);
  }
  
  public void deleteById(Long id) {
    businessTypeRepository.deleteById(id);
  }
}
