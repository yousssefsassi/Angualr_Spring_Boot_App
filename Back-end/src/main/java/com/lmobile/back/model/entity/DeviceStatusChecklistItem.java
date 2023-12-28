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
@Table(name = "device_status_checklist_item")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeviceStatusChecklistItem {

  @Id
  @SequenceGenerator(name = "device_status_checklist_item_id_seq_gen", sequenceName = "device_status_checklist_item_id_seq", initialValue = 1, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "device_status_checklist_item_id_seq_gen")
  @Column(name = "id")
  private Long id;
  
  @Column(name = "name")
  private String name;
  // physical inspection: physical damage, scratches, dents, or cracks on the screen, body, or buttons
  // battery life: check the battery life of the device to ensure it is holding a charge and functioning properly
  // performance testing: test the device's performance by running various applications and checking for any lag or slow response
  // connectivity testing: test the device's connectivity features such as Wi-Fi, Bluetooth, and cellular signal strength
  // camera and audio testing: test the camera and audio features of the device to ensure they are functioning properly
  
  @Column(name = "description_before_rent")
  private String descriptionBeforeRent;
  
  @Column(name = "description_after_rent")
  private String descriptionAfterRent;
  
  @Column(name = "picture_before_rent")
  private String pictureBeforeRent;
  
  @Column(name = "picture_after_rent")
  private String pictureAfterRent;
  
  @Column(name = "has_changed")
  private Boolean hasChanged;
  
  @Column(name = "change_description")
  private String changeDescription;
  
  @Column(name = "created_at")
  private Date createdAt;
  
  @ManyToOne
  @JoinColumn(name = "device_status_checklist_id")
  private DeviceStatusChecklist deviceStatusChecklist;
}
