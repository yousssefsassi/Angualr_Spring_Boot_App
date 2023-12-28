package com.lmobile.back.model.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "rental_device")
@PrimaryKeyJoinColumn(name = "device_id")
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RentalDevice extends Device {

  @OneToMany(mappedBy = "rentalDevice", fetch = FetchType.LAZY)
  private Set<RentedDevice> rentedDeviceList = new HashSet<RentedDevice>();

  @ManyToMany(mappedBy = "rentalDevices")
  @JsonIgnore
  private List<RentalContract> rentalContracts;
}












