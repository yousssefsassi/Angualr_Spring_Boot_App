package com.lmobile.back.model.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lmobile.back.security.model.entity.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "salesman")
@PrimaryKeyJoinColumn(name = "user_id")
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Salesman extends User {

  @ManyToOne
  @JoinColumn(name = "business_type_id")
  private BusinessType businessType;
  
  @OneToMany(mappedBy = "salesman", cascade = CascadeType.ALL)
  @JsonIgnore
  private Set<Device> deviceList = new HashSet<>();

  @OneToMany(mappedBy = "salesman", cascade = CascadeType.ALL)
  @JsonIgnore
  private Set<Contract> contracts = new HashSet<>();
}
