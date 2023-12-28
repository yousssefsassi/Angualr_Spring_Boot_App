package com.lmobile.back.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "offer")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Offer {
  
  @Id
  @SequenceGenerator(name = "offer_id_seq_gen", sequenceName = "offer_id_seq", initialValue = 1, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "offer_id_seq_gen")
  @Column(name = "id")
  private Long id;
  
  @Column(name = "created_at")
  private Date createdAt;
}
