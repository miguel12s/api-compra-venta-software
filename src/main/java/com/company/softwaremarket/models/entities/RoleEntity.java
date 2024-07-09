package com.company.softwaremarket.models.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name="role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder


public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="role_name")
    @Enumerated(EnumType.STRING)
    private RoleEnum roleName;





}
