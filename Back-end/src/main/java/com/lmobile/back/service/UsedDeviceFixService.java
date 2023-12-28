package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.UsedDeviceFix;
import com.lmobile.back.repository.UsedDeviceFixRepository;

@Service
@Transactional
public class UsedDeviceFixService {
  
  @Autowired
  private UsedDeviceFixRepository usedDeviceFixRepository;
  
  public UsedDeviceFix save(UsedDeviceFix usedDeviceFix) {
    return usedDeviceFixRepository.save(usedDeviceFix);
  }
  
  public UsedDeviceFix findById(Long id) {
    return usedDeviceFixRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + UsedDeviceFix.class.getSimpleName() + " with id " + id));
  }
  
  public List<UsedDeviceFix> findAll() {
    return usedDeviceFixRepository.findAll();
  }
  
  public UsedDeviceFix update(Long id, UsedDeviceFix usedDeviceFix) {
    UsedDeviceFix foundUsedDeviceFix = findById(id);
    foundUsedDeviceFix.setDescription(usedDeviceFix.getDescription());
    foundUsedDeviceFix.setDate(usedDeviceFix.getDate());
    foundUsedDeviceFix.setUsedDevice(usedDeviceFix.getUsedDevice());
    return save(foundUsedDeviceFix);
  }
  
  public void deleteById(Long id) {
    usedDeviceFixRepository.deleteById(id);
  }
}
