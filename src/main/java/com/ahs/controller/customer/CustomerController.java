package com.ahs.controller.customer;

import com.ahs.request.CustomerAddReq;
import com.ahs.response.CustomerAddressResponse;
import com.ahs.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/address")
    public ResponseEntity<CustomerAddressResponse> createCustomerAddress(@RequestHeader(name="token", required = true) String token,
                                                                         @RequestBody CustomerAddReq customerAddReq){

        return new ResponseEntity<CustomerAddressResponse>(customerService.createCustomerAddress(customerAddReq), HttpStatus.OK);
    }
}
