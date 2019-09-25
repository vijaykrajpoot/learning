package org.vkrajput.spring.rest.persistence;

import java.util.Collection;
import java.util.HashMap;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.vkrajput.spring.rest.model.Address;
import org.vkrajput.spring.rest.model.Employee;

@Component
public class EmployeeDao {

  HashMap<String, Employee> employeeDB = new HashMap<>();

  @PostConstruct
  public void init() {
    Employee employee = Employee.builder().withAge("40")
        .withAddress(Address.builder().withAddressLine2("#1").withAddressLine1("110 E remington dr")
            .withAddressLine2("APT#1").withCity("SUNNYVALE").withState("CA").withPincode("54564654")
            .withCountry("USA").build())
        .withId("1000").withName("Vijay Kumar Rajpoot").build();
    employeeDB.put(employee.getId(), employee);
  }

  public Collection<Employee> getAllEmployee() {
    return employeeDB.values();

  }
}
