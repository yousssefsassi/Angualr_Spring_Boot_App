package com.lmobile.back.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "used_device_fix")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsedDeviceFix {

  @Id
  @SequenceGenerator(name = "used_device_fix_id_seq_gen", sequenceName = "used_device_fix_id_seq", initialValue = 1, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "used_device_fix_id_seq_gen")
  @Column(name = "id")
  private Long id;
  
  @Column(name = "description")
  private String description;
  
  @Column(name = "date")
  private Date date;
  
  @ManyToOne
  @JoinColumn(name = "used_device_id")
  private UsedDevice usedDevice;
}
