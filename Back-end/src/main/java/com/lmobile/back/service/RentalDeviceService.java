package com.lmobile.back.service;

import java.util.List;

import com.lmobile.back.repository.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.RentalDevice;
import com.lmobile.back.repository.RentalDeviceRepository;

@Service
@Transactional
public class RentalDeviceService {
  
  @Autowired
  private RentalDeviceRepository rentalDeviceRepository;

  @Autowired
  private SalesmanRepository salesmanRepository;
  
  public RentalDevice save(RentalDevice rentalDevice) {
    rentalDevice.setSalesman(salesmanRepository.findByEmail(rentalDevice.getSalesman().getEmail()).get());
    return rentalDeviceRepository.save(rentalDevice);
  }
  
  public RentalDevice findById(Long id) {
    return rentalDeviceRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + RentalDevice.class.getSimpleName() + " with id " + id));
  }
  
  public List<RentalDevice> findAll() {
    return rentalDeviceRepository.findAll();
  }
  
  public RentalDevice update(Long id, RentalDevice rentalDevice) {
    RentalDevice foundRentalDevice = findById(id);
    foundRentalDevice.setDescription(rentalDevice.getDescription());
    foundRentalDevice.setBrand(rentalDevice.getBrand());
    foundRentalDevice.setSerialNumber(rentalDevice.getSerialNumber());
    foundRentalDevice.setPictureFilePath(rentalDevice.getPictureFilePath());
    foundRentalDevice.setPurchasePrice(rentalDevice.getPurchasePrice());
    foundRentalDevice.setYearOfManufacture(rentalDevice.getYearOfManufacture());
    foundRentalDevice.setCreatedAt(rentalDevice.getCreatedAt());
    foundRentalDevice.setSalesman(rentalDevice.getSalesman());
    foundRentalDevice.setDeviceType(rentalDevice.getDeviceType());
    
    foundRentalDevice.setRentedDeviceList(rentalDevice.getRentedDeviceList());
    return save(foundRentalDevice);
  }
  
  public void deleteById(Long id) {
    rentalDeviceRepository.deleteById(id);
  }
}
