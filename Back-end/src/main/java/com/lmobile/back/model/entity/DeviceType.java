package com.lmobile.back.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "device_type")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeviceType {

  @Id
  @SequenceGenerator(name = "device_type_id_seq_gen", sequenceName = "device_type_id_seq", initialValue = 1, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "device_type_id_seq_gen")
  @Column(name = "id")
  private Long id;
  
  @Column(name = "name")
  private String name;
}
