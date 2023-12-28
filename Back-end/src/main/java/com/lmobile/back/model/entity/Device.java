package com.lmobile.back.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "device")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Device {

  @Id
  @SequenceGenerator(name = "device_id_seq_gen", sequenceName = "device_id_seq", initialValue = 1, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "device_id_seq_gen")
  @Column(name = "id")
  private Long id;
  
  @Column(name = "description")
  private String description;
  
  @Column(name = "brand")
  private String brand;
  
  @Column(name = "serial_number")
  private String serialNumber;
  
  @Column(name = "picture_file_path" , length = 2147483647)
  private String pictureFilePath;
  
  @Column(name = "purchase_price")
  private Double purchasePrice;
  
  @Column(name = "year_of_manufacture")
  private Date yearOfManufacture;
  
  @Column(name = "created_at")
  private Date createdAt;
  
  @ManyToOne
  @JoinColumn(name = "salesman_id")
  private Salesman salesman;

  @ManyToOne
  @JoinColumn(name = "device_type_id")
  private DeviceType deviceType;
}
