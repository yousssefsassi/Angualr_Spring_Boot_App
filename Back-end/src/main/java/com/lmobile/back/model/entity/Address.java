package com.lmobile.back.model.entity;

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
@Table(name = "address")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {

  @Id
  @SequenceGenerator(name = "address_id_seq_gen", sequenceName = "address_id_seq", initialValue = 1, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_id_seq_gen")
  @Column(name = "id")
  private Long id;
  
  @Column(name = "street")
  private String street;
  
  @Column(name = "city")
  private String city;
  
  @ManyToOne
  @JoinColumn(name = "country_id")
  private Country country;
  
  @Column(name = "zipCode")
  private Integer zipCode;
}
