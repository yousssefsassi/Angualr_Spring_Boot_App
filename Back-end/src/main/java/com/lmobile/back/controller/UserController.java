package com.lmobile.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmobile.back.security.model.dto.UserDto;
import com.lmobile.back.security.model.mapper.UserMapper;
import com.lmobile.back.security.service.UserService;

@RestController
@RequestMapping("/v1/service/user")
public class UserController {
  
  @Autowired
  private UserService userService;

  @PostMapping(value = "")
  public ResponseEntity<UserDto> create(@RequestBody UserDto userDto) {
    UserDto createdUser = UserMapper.toDto(userService.save(UserMapper.toEntity(userDto)));
    return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<UserDto> getById(@PathVariable("id") Long id) {
    UserDto foundUser = UserMapper.toDto(userService.findById(id));
    return new ResponseEntity<>(foundUser, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<UserDto>> getAll() {
    List<UserDto> foundUser = UserMapper.toDto(userService.findAll());
    return new ResponseEntity<>(foundUser, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<UserDto> update(@PathVariable("id") Long id, @RequestBody UserDto userDto) {
    UserDto updatedUser = UserMapper.toDto(userService.update(id, UserMapper.toEntity(userDto)));
    return new ResponseEntity<>(updatedUser, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    userService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}