package org.vkrajput.spring.boot.gcp.spanner.entity;

import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;
import lombok.Data;


@Data
@Table(name="csc_customer")
public class Customer {

  @Column(name = "USER_NAME", nullable = false, spannerTypeMaxLength = 255)
  private String userName;

  @Column(name = "EMAIL_ADDRESS", nullable = false, spannerTypeMaxLength = 255)
  private String emailAddress;

  @Column(name = "FIRST_NAME", nullable = true, spannerTypeMaxLength = 255)
  private String firstName;

  @Column(name = "LAST_NAME", nullable = true, spannerTypeMaxLength = 255)
  private String lastName;


}
