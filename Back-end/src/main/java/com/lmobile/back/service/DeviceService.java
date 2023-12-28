package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.Device;
import com.lmobile.back.repository.DeviceRepository;

@Service
@Transactional
public class DeviceService {
  
  @Autowired
  private DeviceRepository deviceRepository;
  
  public Device save(Device device) {
    return deviceRepository.save(device);
  }
  
  public Device findById(Long id) {
    return deviceRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + Device.class.getSimpleName() + " with id " + id));
  }
  
  public List<Device> findAll() {
    return deviceRepository.findAll();
  }
  
  public Device update(Long id, Device device) {
    Device foundDevice = findById(id);
    foundDevice.setDescription(device.getDescription());
    foundDevice.setBrand(device.getBrand());
    foundDevice.setSerialNumber(device.getSerialNumber());
    foundDevice.setPictureFilePath(device.getPictureFilePath());
    foundDevice.setPurchasePrice(device.getPurchasePrice());
    foundDevice.setYearOfManufacture(device.getYearOfManufacture());
    foundDevice.setCreatedAt(device.getCreatedAt());
    foundDevice.setSalesman(device.getSalesman());
    foundDevice.setDeviceType(device.getDeviceType());
    return save(foundDevice);
  }
  
  public void deleteById(Long id) {
    deviceRepository.deleteById(id);
  }
}
