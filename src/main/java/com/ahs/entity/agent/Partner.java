package com.ahs.entity.agent;

import com.ahs.entity.customer.CustomerAddress;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "partner")
public class Partner {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="surname")
    private String surName;

    @Column(name = "partner_emp_id")
    private String partnerEmployeeId; // Unique no // can be an employee ID

    @Column(name="email")
    private String email;

    @Column(name = "status")
    private char status; // Active-A  In-active-I  Blocked-B

    @Column(name = "service_category")
    private char serviceCategory; // ID from the ServiceCategory Entity(elec/plum/painter etc)

    @OneToMany(mappedBy = "partner", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PartnerRole> partnerRoleList;

    @OneToMany(mappedBy = "partner", cascade = CascadeType.ALL)
    private List<PartnerPin> partnerPinList;

}
