package com.lmobile.back.model.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "contract")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contract {
  
  @Id
  @SequenceGenerator(name = "user_id_seq_gen", sequenceName = "user_id_seq", initialValue = 1, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq_gen")
  @Column(name = "id")
  private Long id;
  
  @Column(name = "reference")
  private String reference;
  
  @Column(name = "signed_by_owner_at")
  private Date signedByOwnerAt;
  
  @Column(name = "signed_by_partner_at")
  private Date signedByPartnerAt;
  
  @Column(name = "created_at")
  private Date createdAt;

  @ManyToOne
  @JoinColumn(name = "salesman_id")
  private Salesman salesman;
}
