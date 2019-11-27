package com.vkrajput.db.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<com.vkrajput.db.entity.Employee, Integer> {

}
