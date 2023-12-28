package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.UsedDevice;
import com.lmobile.back.repository.UsedDeviceRepository;

@Service
@Transactional
public class UsedDeviceService {
  
  @Autowired
  private UsedDeviceRepository usedDeviceRepository;
  
  public UsedDevice save(UsedDevice usedDevice) {
    return usedDeviceRepository.save(usedDevice);
  }
  
  public UsedDevice findById(Long id) {
    return usedDeviceRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + UsedDevice.class.getSimpleName() + " with id " + id));
  }
  
  public List<UsedDevice> findAll() {
    return usedDeviceRepository.findAll();
  }
  
  public UsedDevice update(Long id, UsedDevice usedDevice) {
    UsedDevice foundUsedDevice = findById(id);
    foundUsedDevice.setDescription(usedDevice.getDescription());
    foundUsedDevice.setBrand(usedDevice.getBrand());
    foundUsedDevice.setSerialNumber(usedDevice.getSerialNumber());
    foundUsedDevice.setPictureFilePath(usedDevice.getPictureFilePath());
    foundUsedDevice.setPurchasePrice(usedDevice.getPurchasePrice());
    foundUsedDevice.setYearOfManufacture(usedDevice.getYearOfManufacture());
    foundUsedDevice.setCreatedAt(usedDevice.getCreatedAt());
    foundUsedDevice.setSalesman(usedDevice.getSalesman());
    foundUsedDevice.setDeviceType(usedDevice.getDeviceType());
    
    foundUsedDevice.setUsedSince(usedDevice.getUsedSince());
    foundUsedDevice.setCurrentState(usedDevice.getCurrentState());
    foundUsedDevice.setUsedDeviceFixList(usedDevice.getUsedDeviceFixList());
    foundUsedDevice.setTradedDeviceList(usedDevice.getTradedDeviceList());
    return save(foundUsedDevice);
  }
  
  public void deleteById(Long id) {
    usedDeviceRepository.deleteById(id);
  }
}
