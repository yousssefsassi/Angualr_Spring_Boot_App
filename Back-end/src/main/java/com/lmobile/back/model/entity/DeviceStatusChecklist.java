package com.lmobile.back.model.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "device_status_checklist")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeviceStatusChecklist {

  @Id
  @SequenceGenerator(name = "device_status_checklist_id_seq_gen", sequenceName = "device_status_checklist_id_seq", initialValue = 1, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "device_status_checklist_id_seq_gen")
  @Column(name = "id")
  private Long id;
  
  @Column(name = "description")
  private String description;
  
  @Column(name = "created_at")
  private Date createdAt;
  
  @OneToMany(mappedBy = "deviceStatusChecklist", cascade = CascadeType.ALL)
  private Set<DeviceStatusChecklistItem> deviceStatusChecklistItemList = new HashSet<>();
}
