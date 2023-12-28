package com.lmobile.back.security.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.lmobile.back.repository.AdminRepository;
import com.lmobile.back.repository.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.lmobile.back.model.entity.Admin;
import com.lmobile.back.model.entity.Salesman;
import com.lmobile.back.security.constant.DefinedRoleSetName;
import com.lmobile.back.security.constant.RoleType;
import com.lmobile.back.security.model.business.CustomUserDetails;
import com.lmobile.back.security.model.entity.Role;
import com.lmobile.back.security.model.entity.User;
import com.lmobile.back.security.model.request.AuthenticationRequest;
import com.lmobile.back.security.model.request.RegisterationRequest;

@Service
public class AuthService {

  @Autowired
  private AuthenticationManager authenticationManager;
  @Autowired
  private CustomUserDetailsService customUserDetailsService;
  @Autowired
  private JwtUtilityService jwtUtilityService;
  @Autowired
  private UserService userService;
  @Autowired
  private RoleService roleService;

  @Autowired
  private AdminRepository adminRepository;
  @Autowired
  private SalesmanRepository salesmanRepository;


  private final Set<RoleType> adminRoleSet = new HashSet<>(Arrays.asList(RoleType.ROLE_ADMIN, RoleType.ROLE_SALESMAN));
  private final Set<RoleType> salesmanRoleSet = new HashSet<>(Arrays.asList(RoleType.ROLE_SALESMAN));

  public User registerUser(RegisterationRequest registerationRequest) {

    if (userService.findByEmail(registerationRequest.getEmail()) != null) {
      throw new IllegalStateException("A " + User.class.getSimpleName() + " with email " + registerationRequest.getEmail() + " already exists.");
    }

    registerationRequest.setPassword(new BCryptPasswordEncoder().encode(registerationRequest.getPassword())); // encrypt
                                                                                                              // password

    switch (registerationRequest.getRoleSetName()) {
      case DefinedRoleSetName.Names.ADMIN:
        Admin admin = new Admin();
        admin.setFirstName(registerationRequest.getFirstName());
        admin.setLastName(registerationRequest.getLastName());
        admin.setEmail(registerationRequest.getEmail());
        admin.setPassword(registerationRequest.getPassword());
        admin.setRoleList(roleTypeSetToRoleSet(adminRoleSet));
        return adminRepository.save(admin);
      case DefinedRoleSetName.Names.SALESMAN:
        Salesman salesman = new Salesman();
        salesman.setFirstName(registerationRequest.getFirstName());
        salesman.setLastName(registerationRequest.getLastName());
        salesman.setEmail(registerationRequest.getEmail());
        salesman.setPassword(registerationRequest.getPassword());
        salesman.setRoleList(roleTypeSetToRoleSet(salesmanRoleSet));
        return salesmanRepository.save(salesman);
      default:
        throw new IllegalStateException("Unable to find matching role list name for " + registerationRequest.getRoleSetName());
    }
  }

  public String authenticateUser(AuthenticationRequest authenticationRequest) {

    Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
        authenticationRequest.getEmail(), authenticationRequest.getPassword(), new ArrayList<>()));
    System.out.println("authentication");
    System.out.println(authentication);

    final CustomUserDetails user = customUserDetailsService.loadUserByUsername(authenticationRequest.getEmail());
    if (user != null) {
      return jwtUtilityService.generateToken(user);
    }
    return null;
  }

  
  
  private Set<Role> roleTypeSetToRoleSet(Set<RoleType> roleTypeSet) {
    Set<Role> roleSet = new HashSet<Role>();
    roleTypeSet.forEach((RoleType roleType) -> {
      roleSet.add(roleService.findByName(roleType));
    });
    return roleSet;
  }


  private Admin buildAdminFromRegisterationRequest(RegisterationRequest registerationRequest) {
    return Admin.builder()
      .firstName(registerationRequest.getFirstName())
      .lastName(registerationRequest.getLastName())
      .email(registerationRequest.getEmail())
      .password(registerationRequest.getPassword())
      .roleList(roleTypeSetToRoleSet(adminRoleSet))
      .build();
  }

  private Salesman buildSalesmanFromRegisterationRequest(RegisterationRequest registerationRequest) {
    return Salesman.builder()
      .firstName(registerationRequest.getFirstName())
      .lastName(registerationRequest.getLastName())
      .email(registerationRequest.getEmail())
      .password(registerationRequest.getPassword())
      .roleList(roleTypeSetToRoleSet(salesmanRoleSet))
      .build();
  }
}
