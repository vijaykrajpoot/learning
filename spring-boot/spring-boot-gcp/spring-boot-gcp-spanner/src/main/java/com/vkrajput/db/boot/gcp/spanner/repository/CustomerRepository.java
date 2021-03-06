package com.vkrajput.db.boot.gcp.spanner.repository;

import org.springframework.cloud.gcp.data.spanner.repository.SpannerRepository;
import org.springframework.stereotype.Repository;
import com.vkrajput.db.boot.gcp.spanner.entity.Customer;


@Repository
public interface CustomerRepository extends SpannerRepository<Customer, Integer> {

}
