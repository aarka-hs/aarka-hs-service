package com.ahs.entity.customer;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Entity
@Table(name = "customer_review")
public class CustomerReview {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="customer_id")
    private String customerId;

    @Column(name="booking_id")
    private String bookingId;


    @Column(name = "rating_value")
    private char rating_value;

    @CreationTimestamp
    @Column(name = "created_ts")
    private Date createdTs;

}
