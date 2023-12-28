package com.lmobile.back.model.entity;

import com.lmobile.back.security.model.entity.User;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "admin")
@PrimaryKeyJoinColumn(name = "user_id") // foreign key column name (inherited)
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admin extends User {
  
  @Transient // to be removed
  private String someAttr;
}
