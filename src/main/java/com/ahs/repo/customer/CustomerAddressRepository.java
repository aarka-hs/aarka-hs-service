package com.ahs.repo.customer;

import com.ahs.entity.customer.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, String> {
}
