package com.lmobile.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lmobile.back.model.dto.AdminDto;
import com.lmobile.back.model.mapper.AdminMapper;
import com.lmobile.back.service.AdminService;

@RestController
@RequestMapping("/v1/service/admin")
public class AdminController {
  
  @Autowired
  private AdminService adminService;

  @PostMapping(value = "")
  public ResponseEntity<AdminDto> create(@RequestBody AdminDto adminDto) {
    AdminDto createdAdmin = AdminMapper.toDto(adminService.save(AdminMapper.toEntity(adminDto)));
    return new ResponseEntity<>(createdAdmin, HttpStatus.CREATED);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<AdminDto> getById(@PathVariable("id") Long id) {
    AdminDto foundAdmin = AdminMapper.toDto(adminService.findById(id));
    return new ResponseEntity<>(foundAdmin, HttpStatus.OK);
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<AdminDto>> getAll() {
    List<AdminDto> foundAdmin = AdminMapper.toDto(adminService.findAll());
    return new ResponseEntity<>(foundAdmin, HttpStatus.OK);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<AdminDto> update(@PathVariable("id") Long id, @RequestBody AdminDto adminDto) {
    AdminDto updatedAdmin = AdminMapper.toDto(adminService.update(id, AdminMapper.toEntity(adminDto)));
    return new ResponseEntity<>(updatedAdmin, HttpStatus.ACCEPTED);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
    adminService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}