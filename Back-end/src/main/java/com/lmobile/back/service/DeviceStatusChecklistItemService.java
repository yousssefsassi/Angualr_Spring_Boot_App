package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.DeviceStatusChecklistItem;
import com.lmobile.back.repository.DeviceStatusChecklistItemRepository;

@Service
@Transactional
public class DeviceStatusChecklistItemService {
  
  @Autowired
  private DeviceStatusChecklistItemRepository deviceStatusChecklistItemRepository;
  
  public DeviceStatusChecklistItem save(DeviceStatusChecklistItem deviceStatusChecklistItem) {
    return deviceStatusChecklistItemRepository.save(deviceStatusChecklistItem);
  }
  
  public DeviceStatusChecklistItem findById(Long id) {
    return deviceStatusChecklistItemRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + DeviceStatusChecklistItem.class.getSimpleName() + " with id " + id));
  }
  
  public List<DeviceStatusChecklistItem> findAll() {
    return deviceStatusChecklistItemRepository.findAll();
  }
  
  public DeviceStatusChecklistItem update(Long id, DeviceStatusChecklistItem deviceStatusChecklistItem) {
    DeviceStatusChecklistItem foundDeviceStatusChecklistItem = findById(id);
    foundDeviceStatusChecklistItem.setName(deviceStatusChecklistItem.getName());
    foundDeviceStatusChecklistItem.setDescriptionBeforeRent(deviceStatusChecklistItem.getDescriptionBeforeRent());
    foundDeviceStatusChecklistItem.setDescriptionAfterRent(deviceStatusChecklistItem.getDescriptionAfterRent());
    foundDeviceStatusChecklistItem.setPictureBeforeRent(deviceStatusChecklistItem.getPictureBeforeRent());
    foundDeviceStatusChecklistItem.setPictureAfterRent(deviceStatusChecklistItem.getPictureAfterRent());
    foundDeviceStatusChecklistItem.setHasChanged(deviceStatusChecklistItem.getHasChanged());
    foundDeviceStatusChecklistItem.setChangeDescription(deviceStatusChecklistItem.getChangeDescription());
    foundDeviceStatusChecklistItem.setCreatedAt(deviceStatusChecklistItem.getCreatedAt());
    foundDeviceStatusChecklistItem.setDeviceStatusChecklist(deviceStatusChecklistItem.getDeviceStatusChecklist());
    return save(foundDeviceStatusChecklistItem);
  }
  
  public void deleteById(Long id) {
    deviceStatusChecklistItemRepository.deleteById(id);
  }
}
