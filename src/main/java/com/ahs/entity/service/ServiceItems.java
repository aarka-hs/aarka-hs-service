package com.ahs.entity.service;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "service_items")
public class ServiceItems {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="service_item_code")
    private String serviceCode;

    @Column(name="service_item_name")
    private String serviceName;

    @Column(name="visit_fee")
    private String visitFee;

    @Column(name="status")
    private String status; // A , I


}
