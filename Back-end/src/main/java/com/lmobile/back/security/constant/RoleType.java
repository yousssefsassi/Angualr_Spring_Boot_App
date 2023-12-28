package com.lmobile.back.security.constant;

public enum RoleType {

  ROLE_ADMIN(Names.ROLE_ADMIN), ROLE_SALESMAN(Names.ROLE_SALESMAN);

  public class Names {
    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_SALESMAN = "ROLE_SALESMAN";
  }

  private final String label;

  private RoleType(String label) {
    this.label = label;
  }

  public String toString() {
    return this.label;
  }
}
