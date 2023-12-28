package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.TradedDevice;
import com.lmobile.back.repository.TradedDeviceRepository;

@Service
@Transactional
public class TradedDeviceService {
  
  @Autowired
  private TradedDeviceRepository tradedDeviceRepository;
  
  public TradedDevice save(TradedDevice tradedDevice) {
    return tradedDeviceRepository.save(tradedDevice);
  }
  
  public TradedDevice findById(Long id) {
    return tradedDeviceRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + TradedDevice.class.getSimpleName() + " with id " + id));
  }
  
  public List<TradedDevice> findAll() {
    return tradedDeviceRepository.findAll();
  }
  
  public TradedDevice update(Long id, TradedDevice tradedDevice) {
    TradedDevice foundTradedDevice = findById(id);
    foundTradedDevice.setCreatedAt(tradedDevice.getCreatedAt());
    foundTradedDevice.setTradeinOffer(tradedDevice.getTradeinOffer());
    foundTradedDevice.setUsedDevice(tradedDevice.getUsedDevice());
    return save(foundTradedDevice);
  }
  
  public void deleteById(Long id) {
    tradedDeviceRepository.deleteById(id);
  }
}
