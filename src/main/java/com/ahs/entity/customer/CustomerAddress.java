//package com.ahs.entity.customer;
//
//import com.ahs.entity.Address;
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Data
//@Entity
//@Table(name = "customer_address")
//public class CustomerAddress {
//
//    @Column(name="customer_id")
//    private String customerId;
//
//    @Column(name="address_id")
//    private String addressId;
//
//    @Column(name = "is_default")
//    private String isDefault; // Y/N
//
//    @OneToMany(mappedBy = "customer_address", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Address> addressList;
//}
