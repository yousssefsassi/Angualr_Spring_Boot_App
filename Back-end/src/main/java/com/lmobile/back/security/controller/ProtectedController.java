package com.lmobile.back.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmobile.back.security.constant.RoleType;

@RestController
@RequestMapping("/v1/protected-apis")
public class ProtectedController {

  
  // http://localhost:8088/lmobile/api/v1/protected-apis/any-authenticated-user-space
  @GetMapping(value = "/any-authenticated-user-space")
  public ResponseEntity<String> helloAnyAuthenticatedUser() {
    return ResponseEntity.ok("space for any authenticated user (with or without a role)");
  }

  // http://localhost:8088/lmobile/api/v1/protected-apis/admin-space
  @GetMapping(value = "/admin-space")
  @Secured({ RoleType.Names.ROLE_ADMIN })
  public ResponseEntity<String> helloAdmins() {
    return ResponseEntity.ok("space for admin");
  }

  // http://localhost:8088/lmobile/api/v1/protected-apis/transporter-space
  @GetMapping(value = "/salesman-space")
  @Secured({ RoleType.Names.ROLE_SALESMAN })
  public ResponseEntity<String> helloTransporters() {
    return ResponseEntity.ok("space for salesman");
  }

  // http://localhost:8088/lmobile/api/v1/protected-apis/common-space
  @GetMapping(value = "/common-space")
  @Secured({ RoleType.Names.ROLE_ADMIN, RoleType.Names.ROLE_SALESMAN })
  public ResponseEntity<String> helloAnyUser() {
    return ResponseEntity.ok("space for any authenticated user (admin or salesman)");
  }

}
