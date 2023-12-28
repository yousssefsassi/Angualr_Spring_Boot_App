package com.lmobile.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lmobile.back.model.entity.Admin;
import com.lmobile.back.repository.AdminRepository;

@Service
@Transactional
public class AdminService {
  
  @Autowired
  private AdminRepository adminRepository;
  
  public Admin save(Admin admin) {
    return adminRepository.save(admin);
  }
  
  public Admin findById(Long id) {
    return adminRepository.findById(id)
      .orElseThrow(() ->  new IllegalStateException("Unable to find " + Admin.class.getSimpleName() + " with id " + id));
  }
  
  public List<Admin> findAll() {
    return adminRepository.findAll();
  }
  
  public Admin update(Long id, Admin admin) {
    Admin foundAdmin = findById(id);
    foundAdmin.setFirstName(admin.getFirstName());
    foundAdmin.setLastName(admin.getLastName());
    foundAdmin.setEmail(admin.getEmail());
    foundAdmin.setProfilePhotoFilePath(admin.getProfilePhotoFilePath());
    foundAdmin.setAddress(admin.getAddress());
    
    return save(foundAdmin);
  }
  
  public void deleteById(Long id) {
    adminRepository.deleteById(id);
  }
}
