package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.RentedDevice;
import com.lmobile.back.repository.RentedDeviceRepository;

@Service
@Transactional
public class RentedDeviceService {
  
  @Autowired
  private RentedDeviceRepository rentedDeviceRepository;
  
  public RentedDevice save(RentedDevice rentedDevice) {
    return rentedDeviceRepository.save(rentedDevice);
  }
  
  public RentedDevice findById(Long id) {
    return rentedDeviceRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + RentedDevice.class.getSimpleName() + " with id " + id));
  }
  
  public List<RentedDevice> findAll() {
    return rentedDeviceRepository.findAll();
  }
  
  public RentedDevice update(Long id, RentedDevice rentedDevice) {
    RentedDevice foundRentedDevice = findById(id);
    foundRentedDevice.setCreatedAt(rentedDevice.getCreatedAt());
    foundRentedDevice.setRentalOffer(rentedDevice.getRentalOffer());
    foundRentedDevice.setRentalDevice(rentedDevice.getRentalDevice());
    foundRentedDevice.setDeviceStatusChecklist(rentedDevice.getDeviceStatusChecklist());
    return save(foundRentedDevice);
  }
  
  public void deleteById(Long id) {
    rentedDeviceRepository.deleteById(id);
  }
}
