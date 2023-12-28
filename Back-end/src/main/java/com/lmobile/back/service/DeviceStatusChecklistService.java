package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.DeviceStatusChecklist;
import com.lmobile.back.repository.DeviceStatusChecklistRepository;

@Service
@Transactional
public class DeviceStatusChecklistService {
  
  @Autowired
  private DeviceStatusChecklistRepository deviceStatusChecklistRepository;
  
  public DeviceStatusChecklist save(DeviceStatusChecklist deviceStatusChecklist) {
    return deviceStatusChecklistRepository.save(deviceStatusChecklist);
  }
  
  public DeviceStatusChecklist findById(Long id) {
    return deviceStatusChecklistRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + DeviceStatusChecklist.class.getSimpleName() + " with id " + id));
  }
  
  public List<DeviceStatusChecklist> findAll() {
    return deviceStatusChecklistRepository.findAll();
  }
  
  public DeviceStatusChecklist update(Long id, DeviceStatusChecklist deviceStatusChecklist) {
    DeviceStatusChecklist foundDeviceStatusChecklist = findById(id);
    foundDeviceStatusChecklist.setDescription(deviceStatusChecklist.getDescription());
    foundDeviceStatusChecklist.setCreatedAt(deviceStatusChecklist.getCreatedAt());
    foundDeviceStatusChecklist.setDeviceStatusChecklistItemList(deviceStatusChecklist.getDeviceStatusChecklistItemList());
    return save(foundDeviceStatusChecklist);
  }
  
  public void deleteById(Long id) {
    deviceStatusChecklistRepository.deleteById(id);
  }
}
