package org.vkrajput.spring.rest.model;

import lombok.Data;
import javax.annotation.Generated;

@Data
public class Employee {
	private	String name;
	private String age;
	private String id;
	private Address address;
	@Generated("SparkTools")
	private Employee(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.id = builder.id;
		this.address = builder.address;
	}
	/**
	 * Creates builder to build {@link Employee}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}
	/**
	 * Builder to build {@link Employee}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String name;
		private String age;
		private String id;
		private Address address;

		private Builder() {
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAge(String age) {
			this.age = age;
			return this;
		}

		public Builder withId(String id) {
			this.id = id;
			return this;
		}

		public Builder withAddress(Address address) {
			this.address = address;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}
}
