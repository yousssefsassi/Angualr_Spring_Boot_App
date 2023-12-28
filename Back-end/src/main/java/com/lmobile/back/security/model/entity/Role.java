package com.lmobile.back.security.model.entity;

import static jakarta.persistence.GenerationType.SEQUENCE;

import com.lmobile.back.security.constant.RoleType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
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
@Table(name = "role")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role {
  
    @Id
    @SequenceGenerator(name = "role_sequence", sequenceName = "role_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "role_sequence")
    @Column(name = "id", updatable = false)
    private Long id;
    
    @Column(name = "name", nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleType name;
}
