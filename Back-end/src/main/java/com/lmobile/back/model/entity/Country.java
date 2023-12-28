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
@Table(name = "country")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Country {

  @Id
  @SequenceGenerator(name = "country_id_seq_gen", sequenceName = "country_id_seq", initialValue = 1, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_id_seq_gen")
  @Column(name = "id")
  private Long id;
  
  @Column(name = "name")
  private String name;
}
