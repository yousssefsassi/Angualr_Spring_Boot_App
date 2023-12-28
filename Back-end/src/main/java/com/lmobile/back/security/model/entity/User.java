package com.lmobile.back.security.model.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.lmobile.back.model.entity.Address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(name = "user_email_unique", columnNames = "email"))
@Inheritance(strategy = InheritanceType.JOINED) // to handle Java inheritance => will create separate tables
@Getter
@Setter
@SuperBuilder // this class will be extended by other classes => use @SuperBuilder instead of @Builder, do the same at child class too
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
  
  @Id
  @SequenceGenerator(name = "user_id_seq_gen", sequenceName = "user_id_seq", initialValue = 1, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq_gen")
  @Column(name = "id")
  private Long id;
  
  @Column(name = "first_name")
  private String firstName;
  
  @Column(name = "last_name")
  private String lastName;
  
  @Column(name = "email")
  private String email;
  
  @Column(name = "profile_photo_file_path")
  private String profilePhotoFilePath;
  
  @Column(name = "created_at")
  private Date createdAt;

  @OneToOne
  @JoinColumn(name = "address_id")
  private Address address;
  //fetch = FetchType.EAGER
  @ManyToMany()
  @JoinTable(name = "user_role")
  private Set<Role> roleList = new HashSet<Role>();

  @Column(name = "password")
  @ToString.Exclude
  private String password;
}
