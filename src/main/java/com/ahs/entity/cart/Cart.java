package com.ahs.entity.cart;

import com.ahs.entity.customer.CustomerAddress;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "service_cat_id")
    private String serviceCatId;

    @Column(name = "cart_total_amount")
    private String cartTotalAmount;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CartItems> cartItemsList;

}
