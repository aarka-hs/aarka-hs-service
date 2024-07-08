//package com.ahs.entity.cart;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "cart_items")
//public class CartItems {
//
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "cart_id")
//    private String cartId;
//
//    @Column(name="service_item_id")
//    private String serviceItemId; //get Full Service Item record
//
//    @Column(name="service_id")
//    private String serviceId;
//
//    @Column(name="quantity")
//    private int quantity;
//
//    @Column(name="tax_and_fees")
//    private int tax;
//
//    @Column(name="tip")
//    private int tip;
//
//}
