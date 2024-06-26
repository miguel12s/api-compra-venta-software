package com.company.softwaremarket.models.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Table(name="product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name",nullable = false)

    private String name;

    @Column(name="description",nullable = false)

    private String description;

    @Column(name="category",nullable = false,length = 100)

    private String category;


    @Column(name="price",nullable = false,precision =10,scale = 2)

    private BigDecimal price;

    @Column(name="coin",nullable = false,length = 10)

    private String coin;

    @Column(name="version",nullable = false,length = 50)

    private String version;

    @Temporal(TemporalType.DATE)
    @Column(name="date_release",nullable = false)
    private Date dateRelease;

    @ManyToOne
    @JoinColumn(name="id_company",referencedColumnName = "id_company")
    private CompanyEntity company;

    @Column(name="name_seller",nullable = false)

    private String nameSeller;

    @Enumerated(EnumType.STRING)
    @Column(name="type_seller",nullable = false)

    private TypeSellerEnum typeSeller;


    @Column(name="information_contact",nullable = false,columnDefinition = "TEXT")

    private String informationContact;

    @Column(name="platform",nullable = false)

    private String platform;

    @Column(name="tecnology_used",nullable = false)

    private String tecnologyUsed;

    @Column(name="requirements",nullable = false,columnDefinition = "TEXT")

    private String requirements;

    @Column(name="type_implentation",nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeImplementationEnum typeImplentation;




    @ManyToOne
    @JoinColumn(name = "id_state", referencedColumnName = "value_detail")

    private DetailsParameterEntity state;

    @Column(name="calification",nullable = false,precision=3,scale = 2)

    private BigDecimal calification;

    @Column(name = "number_opinions", nullable = false)


    private Integer numberOpinions;

    @Column(name="number_sales",nullable = false)

    private Integer numberSales;

    @Column(name="url_demo",nullable = false)

    private String urlDemo;

    @Column(name="url_documentation",nullable = false)

    private String urlDocumentation;

    @Column(name="url_image",nullable = false)

    private String urlImage;

    @Column(name="tags",nullable = false)

    private String tags;

    @Column(name="type_license",nullable = false,length = 50)

    private String typeLicense;

    @Column(name="details_support",nullable = false,columnDefinition = "TEXT")

    private String detailsSupport;


}
