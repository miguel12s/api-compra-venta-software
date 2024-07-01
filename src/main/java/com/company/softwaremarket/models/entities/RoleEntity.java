package com.company.softwaremarket.models.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Set;

@Entity
@Table(name="role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="role_name")
    @Enumerated(EnumType.STRING)
private RoleEnum roleName;





}
