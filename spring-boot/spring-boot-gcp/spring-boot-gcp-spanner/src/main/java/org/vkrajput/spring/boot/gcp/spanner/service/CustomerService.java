package org.vkrajput.spring.boot.gcp.spanner.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vkrajput.spring.boot.gcp.spanner.entity.Customer;
import org.vkrajput.spring.boot.gcp.spanner.repository.CustomerRepository;

/**
 * Hello world!
 *
 */
@Service
public class CustomerService {

  @Autowired
  CustomerRepository customerRepository;

  public void createNewCustomer(Customer customer) {
    customerRepository.save(customer);
  }
  
  public List<Customer>  reteriveCustomers() {
    
     Iterable<Customer> itr=customerRepository.findAll();
     List<Customer> customers=StreamSupport.stream(itr.spliterator(),false).collect(Collectors.toList());
     return customers;
    
     
     /**
      *   return customerRepository.performReadOnlyTransaction(transactionSpannerRepo -> {
      Iterable<Customer> itr = customerRepository.findAll();
      List<Customer> customers =
          StreamSupport.stream(itr.spliterator(), false).collect(Collectors.toList());
      return customers;
    });
      */
   }

}
