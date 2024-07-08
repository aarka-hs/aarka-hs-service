package com.ahs.entity.booking;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Data
@Entity
@Table(name = "bookings")
public class Bookings {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="customer_address_id")
    private String customerAddressId;

    @Column(name="customer_id")
    private String customerId;

    @Column(name="total_fee")
    private String totalFee; // A , I

    @Column(name="service_cat_id")
    private String serviceCatId;

    @Column(name="service_item_id")
    private String serviceItemId;

    @Column(name="booked_ts")
    private String bookedTs;

    @Column(name="last_updated_ts")
    private String lastUpdatedTs;

    @Column(name="last_updated_by")
    private String lastUpdatedBy;

    @Column(name="sch_req_date")
    private String scheduledReqDate;

    @Column(name="sch_req_slot")
    private String scheduledReqSlot;

    @Column(name="booking_assigned_to")
    private String bookingAssignedTo;

    @Column(name="booking_accepted")
    private char bookingAccepted; // Y/N

    @Column(name="booking_assigned_ts")
    private char bookingAssignedTs;

    @Column(name="booking_accepted_ts")
    private char bookingAcceptedTs;

    @Column(name="payment_status")
    private char paymentStatus;

    @Column(name="payment_tracking_id")
    private char paymentTrackingId;

    @Column(name="payment_gateway")
    private char paymentGateway; // RazorPay etc.

    @Column(name="booking_status")
    private char bookingStatus; // N-A-I-C(X)
}
