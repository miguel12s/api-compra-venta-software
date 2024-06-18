package com.company.softwaremarket.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="parameter")

public class ParameterEntity {

    @Id
    @Column(name="id_parameter")
    private String id;
    @Column(unique = true,nullable = false,name="parameter_name")
    private String parameterName;
    private String description;


}
