package com.ahs.entity.service;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "service_category")
public class ServiceCategory {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="service_cat_code")
    private String serviceCode;

    @Column(name="service_cat_name")
    private String serviceName;

    @Column(name="status")
    private String status; // A , I

}
