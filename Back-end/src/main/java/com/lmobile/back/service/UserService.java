package com.lmobile.back.service;
//package com.lmobile.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.lmobile.security.model.entity.User;
//import com.lmobile.security.repository.UserRepository;
//
//@Service
//@Transactional
//public class UserService {
//  
//  @Autowired
//  private UserRepository userRepository;
//  
//  public User save(User user) {
//    return userRepository.save(user);
//  }
//  
//  public User findById(Long id) {
//    return userRepository.findById(id)
//      .orElseThrow(() ->  new IllegalStateException("Unable to find " + User.class.getSimpleName() + " with id " + id));
//  }
//  
//  public List<User> findAll() {
//    return userRepository.findAll();
//  }
//  
//  public User update(Long id, User user) {
//    User foundUser = findById(id);
//    foundUser.setFirstName(user.getFirstName());
//    foundUser.setLastName(user.getLastName());
//    foundUser.setEmail(user.getEmail());
//    foundUser.setProfilePhotoFilePath(user.getProfilePhotoFilePath());
//    foundUser.setAddress(user.getAddress());
//    return save(foundUser);
//  }
//  
//  public void deleteById(Long id) {
//    userRepository.deleteById(id);
//  }
//}
