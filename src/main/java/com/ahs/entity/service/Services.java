package com.ahs.entity.service;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "services")
public class Services {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="service_code")
    private String serviceCode;

    @Column(name="service_name")
    private String serviceName;

    @Column(name="status")
    private String status; // A , I

    @Column(name="price")
    private String price;

    @Column(name="duration")
    private String duration;

}
