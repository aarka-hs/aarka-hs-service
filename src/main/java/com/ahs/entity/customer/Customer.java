package com.ahs.entity.customer;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name = "customer_id")
    private String customerId;  // Firebase ID

    @Column(name = "status")
    private char status; // Active-A  In-active-I  Blocked-B

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_ts")
    private Date createdTs;

    @CurrentTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_logged_in_ts")
    private Date lastLoggedInTs;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CustomerAddress> customerAddressList;

}
