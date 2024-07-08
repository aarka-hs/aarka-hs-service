package com.ahs.entity.booking;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;

import java.util.Date;

@Data
@Entity
@Table(name = "booking_lines")
public class BookingLines {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="booking_id")
    private String bookingId;

    @Column(name="ref_no")
    private int refNo;

    @Column(name="service_id")
    private String serviceId;

    @Column(name="quantity")
    private int quantity;

    @Column(name="each_service_fee")
    private String eachServiceFee;

    @Column(name="service_item_id")
    private String serviceItemId;

    @Column(name="status")
    private char status;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_ts")
    private Date createdTs;

    @CurrentTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_ts")
    private Date updatedTs;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="updated_by")
    private String updated_by;

}
