package com.vkrajput.db.boot.gcp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vkrajput.db.boot.gcp.spanner.entity.Customer;
import com.vkrajput.db.boot.gcp.spanner.service.CustomerService;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @PostMapping(value = "/")
  public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {

    customerService.createNewCustomer(customer);

    return new ResponseEntity<Customer>(HttpStatus.CREATED);
  }


  @GetMapping(value = "/")
  public ResponseEntity<List<Customer>> getCustomers() {

    List<Customer> customers = customerService.reteriveCustomers();

    return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
  }

}
