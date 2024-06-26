package com.company.softwaremarket.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Table(name="profile")
public class PerfilEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_profile_user")
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_user",referencedColumnName = "id_user")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name="id_rol",referencedColumnName = "id")
    private RoleEntity rol;

    @ManyToOne
    @JoinColumn(name="id_state",referencedColumnName = "value_detail")
    private DetailsParameterEntity state;


    @ManyToOne
    @JoinColumn(name="id_company",referencedColumnName = "id_company")
    private CompanyEntity company;

    @Column(name="fecha_created",nullable = false)
    private Date fechaCreated;

    @Column(name="name_seller",nullable = false)

    private String nameSeller;






}
