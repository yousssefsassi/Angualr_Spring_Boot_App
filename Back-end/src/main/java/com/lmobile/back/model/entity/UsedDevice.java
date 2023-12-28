package com.lmobile.back.model.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "used_device")
@PrimaryKeyJoinColumn(name = "device_id")
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsedDevice extends Device {
  
  @Column(name = "used_since")
  private Date usedSince;
  
  @Column(name = "current_state")
  private String currentState;
  
  @OneToMany(mappedBy = "usedDevice", cascade = CascadeType.ALL)
  private Set<UsedDeviceFix> usedDeviceFixList = new HashSet<>();

  @OneToMany(mappedBy = "usedDevice", fetch = FetchType.LAZY)
  private Set<TradedDevice> tradedDeviceList = new HashSet<TradedDevice>();
}
