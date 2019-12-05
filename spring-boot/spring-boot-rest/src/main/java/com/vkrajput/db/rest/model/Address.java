package com.vkrajput.db.rest.model;

import lombok.Data;
import javax.annotation.Generated;

@Data
public class Address {

  private String addressLine1;
  private String addressLine2;
  private String city;
  private String state;
  private String country;
  private String pincode;

  @Generated("SparkTools")
  private Address(Builder builder) {
    this.addressLine1 = builder.addressLine1;
    this.addressLine2 = builder.addressLine2;
    this.city = builder.city;
    this.state = builder.state;
    this.country = builder.country;
    this.pincode = builder.pincode;
  }

  /**
   * Creates builder to build {@link Address}.
   * 
   * @return created builder
   */
  @Generated("SparkTools")
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Builder to build {@link Address}.
   */
  @Generated("SparkTools")
  public static final class Builder {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String pincode;

    private Builder() {}

    public Builder withAddressLine1(String addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    public Builder withAddressLine2(String addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    public Builder withCity(String city) {
      this.city = city;
      return this;
    }

    public Builder withState(String state) {
      this.state = state;
      return this;
    }

    public Builder withCountry(String country) {
      this.country = country;
      return this;
    }

    public Builder withPincode(String pincode) {
      this.pincode = pincode;
      return this;
    }

    public Address build() {
      return new Address(this);
    }
  }
}
