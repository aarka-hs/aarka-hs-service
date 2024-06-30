package com.ahs.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;

import java.util.Date;

@Data
@Entity
@Table(name = "pin_code")
public class PinCode {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="pin_code")
    private int pinCode;

    @Column(name="location")
    private String location;

    @Column(name="state")
    private String state;

    @Column(name="district")
    private String district;

    @Column(name = "status")
    private char status; // Active-A  In-active-I  Blocked-B

    @Column(name="created_by")
    private String createdBy;

    @Column(name="updated_by")
    private String updateBy;

    @Column(name="comments")
    private String comments;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_ts")
    private Date createdTs;

    @CurrentTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_ts")
    private Date updatedTs;

}
