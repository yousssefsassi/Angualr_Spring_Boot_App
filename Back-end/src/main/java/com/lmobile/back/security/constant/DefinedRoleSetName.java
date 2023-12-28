package com.lmobile.back.security.constant;

public enum DefinedRoleSetName {

  ADMIN("ADMIN"), SALESMAN("SALESMAN");

  public class Names {
    public static final String ADMIN = "ADMIN";
    public static final String SALESMAN = "SALESMAN";
  }
  
  private final String label;

  private DefinedRoleSetName(String label) {
    this.label = label;
  }

  public String toString() {
    return this.label;
  }
}