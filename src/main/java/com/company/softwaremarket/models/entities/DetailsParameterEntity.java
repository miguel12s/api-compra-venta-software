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
@Table(name="details_parameter",indexes = @Index(name="idx_value_detail",columnList = "value_detail"))

//
// "parameter":{
//         "id": "PAIS",
//         "parameterName": "nombre de paises",
//         "description": "nombre de paises"
//         },
//
//         "description":"colombia",
//         "valueDetail":"CO"

public class DetailsParameterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ParameterEntity parameter;
    @Column(nullable = false,unique = true)
    private String description;
    @Column(nullable=false,name="value_detail")
    private String valueDetail;
    @OneToMany(mappedBy = "country")
    private Set<CompanyEntity> companyEntitySet;
    @OneToMany(mappedBy = "department")
    private Set<CompanyEntity> companyEntity;


}
