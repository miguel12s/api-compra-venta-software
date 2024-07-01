package com.company.softwaremarket.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "company")

public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company")

    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_country", referencedColumnName = "value_detail")
    private DetailsParameterEntity country;

    @ManyToOne
    @JoinColumn(name = "id_department", referencedColumnName = "value_detail")
    private DetailsParameterEntity department;

    @Column(nullable = false, unique = true)
    private String nit;

    @Column(nullable = false, name = "company_name")
    private String companyName;

    @Column(name = "activity_ciiu", nullable = false)
    private String activityCIIU;

    @Column(name = "contact_company", nullable = false)
    private String contactCompany;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false, unique = true)
    private String email;

//    @OneToMany(mappedBy = "company")
//    private Set<PerfilEntity> perfilEntities;
//
//    @OneToMany(mappedBy = "company")
//
//    private Set<ProductEntity> productEntities;
}
