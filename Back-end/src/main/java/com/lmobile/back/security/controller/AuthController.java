package com.lmobile.back.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmobile.back.security.model.business.CustomUserDetails;
import com.lmobile.back.security.model.payload.AuthenticationResponse;
import com.lmobile.back.security.model.request.AuthenticationRequest;
import com.lmobile.back.security.model.request.RegisterationRequest;
import com.lmobile.back.security.service.AuthService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/v1/service/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

  @Autowired
  private AuthService authService;
  

  // http://localhost:8088/lmobile/api/v1/service/auth/register
  @PostMapping("/register")
  public ResponseEntity<Object> register(@RequestBody RegisterationRequest registerationRequest) throws Exception {
    try {
      CustomUserDetails customUserDetails = new CustomUserDetails(authService.registerUser(registerationRequest));
      return new ResponseEntity<>(customUserDetails, HttpStatus.CREATED);
      //return new ResponseEntity<>(HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>("Registration error: unable to register new user :: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }
  
  // http://localhost:8088/lmobile/api/v1/service/auth/authenticate
  @PostMapping("/authenticate")
  public ResponseEntity<Object> authenticate(@RequestBody AuthenticationRequest request, HttpServletResponse response) {
    try {
      String jwt = authService.authenticateUser(request);
      AuthenticationResponse authenticationResponse = null;
      if (jwt != null) {
        authenticationResponse = AuthenticationResponse.builder().accessToken(jwt).build();
      }
      return new ResponseEntity<>(authenticationResponse, HttpStatus.OK);
    } catch (Exception e) {
      System.out.println(e);
      return new ResponseEntity<>("Authentication error: incorrect email or password.", HttpStatus.BAD_REQUEST);
    }
  }

}

