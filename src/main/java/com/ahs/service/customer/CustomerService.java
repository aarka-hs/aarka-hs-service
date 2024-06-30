package com.ahs.service.customer;

import com.ahs.entity.customer.CustomerAddress;
import com.ahs.repo.customer.CustomerAddressRepository;
import com.ahs.request.CustomerAddReq;
import com.ahs.response.CustomerAddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerAddressRepository customerAddressRepo;

    public CustomerAddressResponse createCustomerAddress(CustomerAddReq customerAddReq){

        CustomerAddress customerAddress = new CustomerAddress();
        customerAddressRepo.save(customerAddress);
        return new CustomerAddressResponse();

    }

}
