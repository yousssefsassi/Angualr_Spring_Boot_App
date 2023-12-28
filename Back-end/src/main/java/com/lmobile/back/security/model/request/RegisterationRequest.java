package com.lmobile.back.security.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterationRequest {
  
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String roleSetName;
}
