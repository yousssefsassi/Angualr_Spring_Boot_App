package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.DeviceType;
import com.lmobile.back.repository.DeviceTypeRepository;

@Service
@Transactional
public class DeviceTypeService {
  
  @Autowired
  private DeviceTypeRepository deviceTypeRepository;
  
  public DeviceType save(DeviceType deviceType) {
    return deviceTypeRepository.save(deviceType);
  }
  
  public DeviceType findById(Long id) {
    return deviceTypeRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + DeviceType.class.getSimpleName() + " with id " + id));
  }
  
  public List<DeviceType> findAll() {
    return deviceTypeRepository.findAll();
  }
  
  public DeviceType update(Long id, DeviceType deviceType) {
    DeviceType foundDeviceType = findById(id);
    foundDeviceType.setName(deviceType.getName());
    return save(foundDeviceType);
  }
  
  public void deleteById(Long id) {
    deviceTypeRepository.deleteById(id);
  }
}
